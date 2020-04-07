package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Category;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@SessionScoped
@Named
public class CategoryController implements Serializable {

    private Category category;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String createCategory() {
        this.category = new Category();
        return "/category/create.xhtml?faces-redirect=true";
    }

    public ArrayList<Category> getAllCategories() {
        return Category.findAll();
    }

    public String editCategory(Category category) {
        this.category = category;
        return "/category/update.xhtml?faces-redirect=true";
    }

    public void deleteCategory(Category category) {
        category.delete();
    }

    public String saveCategory() {
        category.save();
        return "/category/index.xhtml?faces-redirect=true";
    }
}
