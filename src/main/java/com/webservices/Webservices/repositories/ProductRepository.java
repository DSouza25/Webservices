package com.webservices.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.Webservices.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long>{
    
}
