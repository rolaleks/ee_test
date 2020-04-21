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
}
