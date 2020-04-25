package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Product;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import java.util.List;

@Stateless
public class ProductRepository extends BaseRepository implements IProductRepository {

    @Override
    public Product find(Integer id) {
        return entityManager.find(Product.class, id);
    }

    public List<Product> findAll() {
        return entityManager.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    public List<Product> findByCategory(Integer id) {
        return entityManager.createQuery("from Product where category_id = :category_id", Product.class)
                .setParameter("category_id", id)
                .getResultList();
    }

    public Product find(String name) {
        return entityManager.createQuery("from Product where name = :name", Product.class)
                .setParameter("name", name).getSingleResult();
    }
}
