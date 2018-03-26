package com.microservices.registerationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.registerationservice.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
