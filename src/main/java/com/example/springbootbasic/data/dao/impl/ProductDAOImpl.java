package com.example.springbootbasic.data.dao.impl;

import com.example.springbootbasic.data.dao.ProductDAO;
import com.example.springbootbasic.data.entity.Product;
import com.example.springbootbasic.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product) {
        Product saveProduct = productRepository.save(product);
        return saveProduct;
    }

    @Override
    public Product selectProduct(Long number) {
        Product selectedProduct = productRepository.getById(number);
        return selectedProduct;
    }

    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);

        Product updateProduct;
        if (selectedProduct.isPresent()){
            Product product = selectedProduct.get();

            product.setName(name);
            product.setUpdateAt(LocalDateTime.now());

            updateProduct = productRepository.save(product);
        } else {
            throw new Exception();
        }

        return updateProduct;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);

        if (selectedProduct.isPresent()){
            Product product = selectedProduct.get();

            productRepository.delete(product);
        } else {
            throw new Exception();
        }

    }
}
