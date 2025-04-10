package com.webservices.Webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.Webservices.entities.User;
import com.webservices.Webservices.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> u =  repository.findById(id);
        return u.get();
    }
}
