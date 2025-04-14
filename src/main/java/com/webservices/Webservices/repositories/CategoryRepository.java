package com.webservices.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.Webservices.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{
    
}
