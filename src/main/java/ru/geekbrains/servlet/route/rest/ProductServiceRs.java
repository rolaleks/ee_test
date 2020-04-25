package ru.geekbrains.servlet.route.rest;

import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Local
@Path("/v1/product")
public interface ProductServiceRs {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductRepr> findAll();

    @GET
    @Path("/all/{id}/category_id")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductRepr> findByCategory(@PathParam("id") Integer id);

    @GET
    @Path("/{id}/id")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductRepr find(@PathParam("id") Integer id);

    @GET
    @Path("/{name}/name")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductRepr findByName(@PathParam("name") String name);

    @DELETE
    @Path("/delete/{id}")
    public void delete(@PathParam("id") Integer id);

    @PUT
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(ProductRepr product);
}
