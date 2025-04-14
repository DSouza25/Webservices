package com.webservices.Webservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Webservices.entities.Product;
import com.webservices.Webservices.services.ProductServices;



@RestController
@RequestMapping("/products")
public class ProductResources {
    
    @Autowired
    private ProductServices services;

    @GetMapping()
    public ResponseEntity<List<Product>> findAll(){

        List<Product> list = services.findAll();
        
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Long id) {
        
        Product u = services.findById(id);
        

        return ResponseEntity.ok().body(u);
    }
    
}
