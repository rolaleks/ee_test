package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Product;
import ru.geekbrains.servlet.route.repository.IProductRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ProductService implements IProductService {

    @EJB
    private IProductRepository productRepository;

    @TransactionAttribute
    public List<ProductRepr> findAll() {

        return productRepository.findAll().stream().map(ProductRepr::new).collect(Collectors.toList());
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
}
