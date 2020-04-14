package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.record.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;

@ApplicationScoped
@Named
public class CategoryRepository extends BaseRepository {

    @Override
    public Category find(Integer id) {
        return entityManager.find(Category.class, id);
    }

    public List<Category> findAll() {
        return entityManager.createQuery("from Category", Category.class).getResultList();
    }
}
