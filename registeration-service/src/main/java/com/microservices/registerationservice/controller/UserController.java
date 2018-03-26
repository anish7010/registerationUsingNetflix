package com.microservices.registerationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.registerationservice.entity.User;
import com.microservices.registerationservice.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register-user")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> showAllUsers() {
		return userRepository.findAll();
	}
}
