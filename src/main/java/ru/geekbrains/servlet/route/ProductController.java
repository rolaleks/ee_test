package ru.geekbrains.servlet.route;

import ru.geekbrains.servlet.route.record.Product;
import ru.geekbrains.servlet.route.service.CategoryRepr;
import ru.geekbrains.servlet.route.service.IProductService;
import ru.geekbrains.servlet.route.service.ProductRepr;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class ProductController implements Serializable {

    @EJB
    private IProductService productService;

    @EJB
    private Cart cart;

    private ProductRepr product;

    private CategoryRepr category;

    public ProductRepr getProduct() {
        return product;
    }


    public void setProduct(ProductRepr product) {
        this.product = product;
    }

    public String createProduct() {
        this.product = new ProductRepr();
        return "/product/create.xhtml?faces-redirect=true";
    }

    public void search(CategoryRepr category) {
        this.category = category;
        System.out.println("!!!!!!!!!!!!!!!!!!");
    }


    public List<ProductRepr> getAllProduct() {
        System.out.println(category);
        if (this.category != null) {
            return category.getProducts();
        }
        return productService.findAll();
    }

    public String editProduct(ProductRepr product) {
        this.product = product;
        return "/product/update.xhtml?faces-redirect=true";
    }

    public void addToCart(ProductRepr product) {

        this.cart.addProduct(product);
    }

    public void deleteProduct(ProductRepr product) {
        productService.delete(product);
    }

    public String saveProduct() {
        if (product.getId() == null) {
            productService.insert(product);
        } else {
            productService.update(product);
        }
        return "/product/index.xhtml?faces-redirect=true";
    }

    public CategoryRepr getCategory() {
        return category;
    }

    public void setCategory(CategoryRepr category) {
        this.category = category;
    }
}
