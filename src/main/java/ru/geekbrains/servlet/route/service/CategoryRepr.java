package ru.geekbrains.servlet.route.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.record.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepr {

    private Integer id;

    private String name;

    @JsonIgnore
    private List<ProductRepr> products;

    public CategoryRepr() {
    }


    public CategoryRepr(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.products = new ArrayList<>();
        for (Product p : category.getProducts()) {
            ProductRepr productRepr = new ProductRepr(p, this);
            this.products.add(productRepr);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<ProductRepr> getProducts() {
        return products;
    }
}
