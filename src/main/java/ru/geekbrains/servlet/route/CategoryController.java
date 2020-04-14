package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Category;
import ru.geekbrains.servlet.route.service.CategoryRepr;
import ru.geekbrains.servlet.route.service.CategoryService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SessionScoped
@Named
public class CategoryController implements Serializable {

    @Inject
    private CategoryService categoryService;

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
