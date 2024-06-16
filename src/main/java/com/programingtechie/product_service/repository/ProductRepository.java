package com.programingtechie.product_service.repository;

import com.programingtechie.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String> {
}
