package com.webservices.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.Webservices.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long>{
    
}
