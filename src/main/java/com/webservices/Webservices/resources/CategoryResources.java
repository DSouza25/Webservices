package com.webservices.Webservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Webservices.entities.Category;
import com.webservices.Webservices.services.CategoryServices;



@RestController
@RequestMapping("/categories")
public class CategoryResources {
    
    @Autowired
    private CategoryServices services;

    @GetMapping()
    public ResponseEntity<List<Category>> findAll(){

        List<Category> list = services.findAll();
        
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") Long id) {
        
        Category u = services.findById(id);
        

        return ResponseEntity.ok().body(u);
    }
    
}
