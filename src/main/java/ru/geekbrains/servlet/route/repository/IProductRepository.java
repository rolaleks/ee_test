package ru.geekbrains.servlet.route.repository;

import ru.geekbrains.servlet.route.record.Product;

import javax.ejb.Local;
import javax.ejb.TransactionAttribute;
import java.util.List;

@Local
public interface IProductRepository {

    Object find(Integer id);

    List<Product> findAll();

    void insert(Object o);

    @TransactionAttribute
    void update(Object o);

    @TransactionAttribute
    void delete(Integer id);

    @TransactionAttribute
    void delete(Object o);
}
