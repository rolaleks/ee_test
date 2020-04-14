package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.repository.CategoryRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@Named
public class CategoryService {

    @Inject
    private CategoryRepository categoryRepository;

    @Transactional
    public List<CategoryRepr> findAll() {

        return categoryRepository.findAll().stream().map(CategoryRepr::new).collect(Collectors.toList());
    }

    @Transactional
    public CategoryRepr find(Integer id) {

        return new CategoryRepr(categoryRepository.find(id));
    }

    @Transactional
    public void delete(CategoryRepr category) {
        categoryRepository.delete(category.getId());
    }

    @Transactional
    public void insert(CategoryRepr category) {
        categoryRepository.insert(new Category(category));
    }

    @Transactional
    public void update(CategoryRepr category) {
        categoryRepository.update(new Category(category));
    }
}
