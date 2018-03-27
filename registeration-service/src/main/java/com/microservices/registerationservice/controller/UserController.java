package com.microservices.registerationservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.registerationservice.entity.User;
import com.microservices.registerationservice.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@GetMapping("/users")
	public List<User> showAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{uName}")
	public User showUser(@PathVariable String uName) {
		 User user = userRepository.findById(uName).get();
		 return user;
	}
	
	@PutMapping("/users/{uName}")
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/users/{uName}")
	public void deleteUser(@PathVariable String uName) {
		userRepository.deleteById(uName);
	}
	
}

	
