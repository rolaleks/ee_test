package ru.geekbrains.servlet.route.record;

import ru.geekbrains.servlet.route.service.CategoryRepr;

import javax.persistence.*;
import java.util.List;

@Table(name = "categories")
@Entity
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Product> products;

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    public Category(CategoryRepr category) {
        this.id = category.getId();
        this.name = category.getName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
