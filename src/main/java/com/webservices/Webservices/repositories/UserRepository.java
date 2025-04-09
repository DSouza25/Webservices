package com.webservices.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.Webservices.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{
    
}
