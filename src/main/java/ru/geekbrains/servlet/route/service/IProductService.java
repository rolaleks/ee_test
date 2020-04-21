package ru.geekbrains.servlet.route.service;

import javax.ejb.Local;
import javax.ejb.TransactionAttribute;
import java.util.List;

@Local
public interface IProductService {

    @TransactionAttribute
    public List<ProductRepr> findAll();

    @TransactionAttribute
    public void delete(ProductRepr product);

    @TransactionAttribute
    public void insert(ProductRepr product);

    @TransactionAttribute
    public void update(ProductRepr product) ;
}
