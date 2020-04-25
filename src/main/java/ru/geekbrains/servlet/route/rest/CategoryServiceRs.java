package ru.geekbrains.servlet.route.rest;

import ru.geekbrains.servlet.route.service.CategoryRepr;
import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.ejb.Local;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Local
@Path("/v1/category")
public interface CategoryServiceRs {

    @PUT
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(CategoryRepr category);
}
