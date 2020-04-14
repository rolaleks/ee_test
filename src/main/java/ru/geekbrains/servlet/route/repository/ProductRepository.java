package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;

@ApplicationScoped
@Named
public class ProductRepository extends BaseRepository {

    @Override
    public Product find(Integer id) {
        return entityManager.find(Product.class, id);
    }

    public List<Product> findAll() {
        return entityManager.createQuery("from Product", Product.class).getResultList();
    }
}
