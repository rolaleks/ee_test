package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
@Named
public class CartController implements Serializable {


    @Inject
    private Cart cart;

    public ArrayList<Product> getAllProduct() {
        return cart.getProducts();
    }

    public void deleteProduct(Product product) {
        cart.delete(product);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
