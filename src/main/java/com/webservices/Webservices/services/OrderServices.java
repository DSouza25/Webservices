package com.webservices.Webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.Webservices.entities.Order;
import com.webservices.Webservices.repositories.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> u =  repository.findById(id);
        return u.get();
    }
}
