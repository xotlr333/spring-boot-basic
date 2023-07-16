package com.example.springbootbasic.data.repository;

import com.example.springbootbasic.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
