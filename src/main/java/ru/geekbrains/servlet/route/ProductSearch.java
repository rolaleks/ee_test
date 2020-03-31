package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductSearch {


    public List<ru.geekbrains.servlet.route.record.Product> getProducts() {
        ArrayList<ru.geekbrains.servlet.route.record.Product> products = new ArrayList<>();
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 1", 100));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 2", 50));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 3", 99.9));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 4", 5000));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 5", 1));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 6", 3577));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 7", 999));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 8", 5));
        products.add(new ru.geekbrains.servlet.route.record.Product("Product 9", 888));

        return products;
    }
}
