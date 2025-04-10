package com.webservices.Webservices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Webservices.entities.User;
import com.webservices.Webservices.services.UserServices;



@RestController
@RequestMapping("/users")
public class UserResources {
    
    @Autowired
    private UserServices services;

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){

        List<User> list = services.findAll();
        
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        
        User u = services.findById(id);
        

        return ResponseEntity.ok().body(u);
    }
    
}
