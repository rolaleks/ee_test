package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
@Named
public class Cart implements Serializable {


    private ArrayList<Product> products;

    public Cart() {

        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void delete(Product product) {
        products.remove(product);
    }
}
