package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.service.CategoryRepr;
import ru.geekbrains.servlet.route.service.ICatalogService;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class CategoryController implements Serializable {

    @EJB
    private ICatalogService categoryService;

    private CategoryRepr category;

    public CategoryRepr getCategory() {
        return category;
    }

    public void setCategory(CategoryRepr category) {
        this.category = category;
    }

    public String createCategory() {
        this.category = new CategoryRepr();
        return "/category/create.xhtml?faces-redirect=true";
    }

    public List<CategoryRepr> getAllCategories() {
        return categoryService.findAll();
    }

    public String editCategory(CategoryRepr category) {
        this.category = category;
        return "/category/update.xhtml?faces-redirect=true";
    }

    public void deleteCategory(CategoryRepr category) {
        categoryService.delete(category);
    }

    public String saveCategory() {
        if (category.getId() == null) {
            categoryService.insert(category);
        } else {
            categoryService.update(category);
        }
        return "/category/index.xhtml?faces-redirect=true";
    }
}
