package com.example.springbootbasic.service.impl;

import com.example.springbootbasic.data.dao.ProductDAO;
import com.example.springbootbasic.data.dto.ProductDto;
import com.example.springbootbasic.data.dto.ProductResponseDto;
import com.example.springbootbasic.data.entity.Product;
import com.example.springbootbasic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    @Override
    public ProductResponseDto getProduct(Long number) {
        Product product = productDAO.selectProduct(number);

        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setNumber(product.getNumber());
        productResponseDto.setName(product.getName());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setStock(product.getStock());

        return productResponseDto;
    }

    @Override
    public ProductResponseDto saveProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductResponseDto changeProductName(Long number, String name) {
        return null;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

    }
}
