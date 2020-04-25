package ru.geekbrains.servlet.route.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductServiceWs {

    @WebMethod
    public List<ProductRepr> findAll();

    @WebMethod
    public List<ProductRepr> findByCategory(Integer id);

    @WebMethod
    public ProductRepr find(Integer id);

    @WebMethod
    public ProductRepr findByName(String name);

    @WebMethod
    public void delete(ProductRepr product);

    @WebMethod
    public void insert(ProductRepr product);
}
