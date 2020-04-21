package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;

@Stateful
public class Cart implements Serializable {


    private ArrayList<ProductRepr> products;

    public Cart() {

        this.products = new ArrayList<>();
    }

    public void addProduct(ProductRepr product) {
        this.products.add(product);
    }

    public ArrayList<ProductRepr> getProducts() {
        return products;
    }

    public void delete(ProductRepr product) {
        products.remove(product);
    }
}
