package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Product;

import javax.ejb.Local;
import javax.ejb.TransactionAttribute;
import java.util.List;

@Local
public interface IProductRepository {

    Object find(Integer id);

    Object find(String name);

    List<Product> findAll();

    List<Product> findByCategory(Integer id);

    void insert(Object o);

    @TransactionAttribute
    void update(Object o);

    @TransactionAttribute
    void delete(Integer id);

    @TransactionAttribute
    void delete(Object o);
}
