package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;
import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
@Named
public class CartController implements Serializable {


    @EJB
    private Cart cart;

    public ArrayList<ProductRepr> getAllProduct() {
        return cart.getProducts();
    }

    public void deleteProduct(ProductRepr product) {
        cart.delete(product);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
