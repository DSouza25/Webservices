package com.webservices.Webservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Webservices.entities.Order;
import com.webservices.Webservices.services.OrderServices;



@RestController
@RequestMapping("/orders")
public class OrderResources {
    
    @Autowired
    private OrderServices services;

    @GetMapping()
    public ResponseEntity<List<Order>> findAll(){

        List<Order> list = services.findAll();
        
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable("id") Long id) {
        
        Order u = services.findById(id);
        

        return ResponseEntity.ok().body(u);
    }
    
}
