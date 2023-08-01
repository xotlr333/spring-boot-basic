package com.example.springbootbasic.service;

import com.example.springbootbasic.data.dto.ProductDto;
import com.example.springbootbasic.data.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name);

    void deleteProduct(Long number) throws Exception;
}
