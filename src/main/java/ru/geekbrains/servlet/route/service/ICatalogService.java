package ru.geekbrains.servlet.route.service;

import javax.ejb.Local;
import javax.ejb.TransactionAttribute;
import java.util.List;

@Local
public interface ICatalogService {

    @TransactionAttribute
    public List<CategoryRepr> findAll();

    @TransactionAttribute
    public CategoryRepr find(Integer id);

    @TransactionAttribute
    public void delete(CategoryRepr category);

    @TransactionAttribute
    public void insert(CategoryRepr category);

    @TransactionAttribute
    public void update(CategoryRepr category);
}
