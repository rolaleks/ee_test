package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Category;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CategoryRepository extends BaseRepository implements ICatalogRepository {

    @Override
    public Category find(Integer id) {
        return entityManager.find(Category.class, id);
    }

    public List<Category> findAll() {
        return entityManager.createQuery("from Category", Category.class).getResultList();
    }
}
