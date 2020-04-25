package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.record.Product;

import javax.enterprise.inject.spi.CDI;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductRepr {

    private Integer id;

    private String name;

    private String description;

    private double price;

    @JsonIgnore
    private CategoryRepr category;

    public ProductRepr() {
    }

    public ProductRepr(Product product) {
        setProduct(product);
        Category category = product.getCategory();
        if (category != null) {
            this.category = new CategoryRepr(category);
        }
    }

    public ProductRepr(Product product, CategoryRepr categoryRepr) {
        setProduct(product);
        this.category = categoryRepr;
    }

    private void setProduct(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryRepr getCategory() {
        return category;
    }

    public void setCategory(CategoryRepr category) {
        this.category = category;
    }

    public Integer getCategoryId() {
        if (category == null) {
            return null;
        }
        return category.getId();
    }

    public void setCategoryId(Integer categoryId) {
        this.category = CDI.current().select(CategoryService.class).get().find(categoryId);
    }
}
