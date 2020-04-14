package ru.geekbrains.servlet.route.record;


import ru.geekbrains.servlet.route.service.CategoryRepr;
import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.persistence.*;

@Table(name = "products")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @ManyToOne
    private Category category;

    public Product() {

    }

    public Product(ProductRepr product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        CategoryRepr categoryRepr = product.getCategory();
        if (categoryRepr != null) {
            this.category = new Category(categoryRepr);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
