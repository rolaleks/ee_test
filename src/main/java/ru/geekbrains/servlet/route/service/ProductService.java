package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Product;
import ru.geekbrains.servlet.route.repository.IProductRepository;
import ru.geekbrains.servlet.route.rest.ProductServiceRs;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
@WebService(endpointInterface = "ru.geekbrains.servlet.route.service.ProductServiceWs", serviceName = "productService")
public class ProductService implements IProductService, ProductServiceWs, ProductServiceRs {

    @EJB
    private IProductRepository productRepository;

    @TransactionAttribute
    public List<ProductRepr> findAll() {

        return productRepository.findAll().stream().map(ProductRepr::new).collect(Collectors.toList());
    }

    @Override
    public List<ProductRepr> findByCategory(Integer id) {
        return productRepository.findByCategory(id).stream().map(ProductRepr::new).collect(Collectors.toList());
    }

    @TransactionAttribute
    public void delete(ProductRepr product) {
        productRepository.delete(product.getId());
    }

    @TransactionAttribute
    public void insert(ProductRepr product) {
        productRepository.insert(new Product(product));
    }

    @TransactionAttribute
    public void update(ProductRepr product) {
        productRepository.update(new Product(product));
    }

    @TransactionAttribute
    public ProductRepr find(Integer id) {
        return new ProductRepr((Product) productRepository.find(id));
    }

    @TransactionAttribute
    public ProductRepr findByName(String name) {
        return new ProductRepr((Product) productRepository.find(name));
    }

    @Override
    public void delete(Integer id) {
        productRepository.delete(id);
    }
}
