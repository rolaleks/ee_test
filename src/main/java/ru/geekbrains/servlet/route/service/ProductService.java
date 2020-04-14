package ru.geekbrains.servlet.route.service;

import ru.geekbrains.servlet.route.record.Product;
import ru.geekbrains.servlet.route.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@Named
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    @Transactional
    public List<ProductRepr> findAll() {

        return productRepository.findAll().stream().map(ProductRepr::new).collect(Collectors.toList());
    }

    @Transactional
    public void delete(ProductRepr product) {
        productRepository.delete(product.getId());
    }

    @Transactional
    public void insert(ProductRepr product) {
        productRepository.insert(new Product(product));
    }

    @Transactional
    public void update(ProductRepr product) {
        productRepository.update(new Product(product));
    }
}
