package com.webservices.Webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Webservices.entities.User;


@RestController
@RequestMapping(value="/users")
public class UserResources {
    
    @GetMapping()
    public ResponseEntity<User> findAll(){
        User u = new User(12L, "Dário", "dario@.com", "99999-9999", "123123");
        
        return ResponseEntity.ok().body(u);
    }
}
