package ru.geekbrains.servlet.route.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CategoryServiceWs {

    @WebMethod
    public void insert(CategoryRepr product);
}
