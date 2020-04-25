package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.repository.ICatalogRepository;
import ru.geekbrains.servlet.route.rest.CategoryServiceRs;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
@WebService(endpointInterface = "ru.geekbrains.servlet.route.service.CategoryServiceWs", serviceName = "categoryService")
public class CategoryService implements ICatalogService, CategoryServiceWs, CategoryServiceRs {

    @EJB
    private ICatalogRepository categoryRepository;

    @TransactionAttribute
    public List<CategoryRepr> findAll() {

        return categoryRepository.findAll().stream().map(CategoryRepr::new).collect(Collectors.toList());
    }

    @TransactionAttribute
    public CategoryRepr find(Integer id) {

        return new CategoryRepr(categoryRepository.find(id));
    }

    @TransactionAttribute
    public void delete(CategoryRepr category) {
        categoryRepository.delete(category.getId());
    }

    @TransactionAttribute
    public void insert(CategoryRepr category) {
        categoryRepository.insert(new Category(category));
    }

    @TransactionAttribute
    public void update(CategoryRepr category) {
        categoryRepository.update(new Category(category));
    }
}
