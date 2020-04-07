package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
@Named
public class ProductController implements Serializable {


    private Product product;

    @Inject
    private Cart cart;

    public Product getProduct() {
        return product;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public String createProduct() {
        this.product = new Product();
        return "/product/create.xhtml?faces-redirect=true";
    }

    public ArrayList<Product> getAllProduct() {
        return Product.findAll();
    }

    public String editProduct(Product product) {
        this.product = product;
        return "/product/update.xhtml?faces-redirect=true";
    }

    public void addToCart(Product product) {

        this.cart.addProduct(product);
    }

    public void deleteProduct(Product product) {
        product.delete();
    }

    public String saveProduct() {
        product.save();
        return "/product/index.xhtml?faces-redirect=true";
    }
}
