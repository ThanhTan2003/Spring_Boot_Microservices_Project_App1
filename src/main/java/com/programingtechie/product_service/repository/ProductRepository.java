package com.programingtechie.product_service.repository;

import com.programingtechie.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ProductRepository extends JpaRepository<Product, String> {
}
