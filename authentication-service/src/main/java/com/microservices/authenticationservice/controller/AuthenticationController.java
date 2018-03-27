package com.microservices.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.authenticationservice.entity.User;
import com.microservices.authenticationservice.proxy.AuthenticationProxy;

@RestController
public class AuthenticationController {
  
  @Autowired
  private AuthenticationProxy proxy;
  
  @GetMapping("/hello")
  public String hello() {
    return "hi";
  }
  
  @PostMapping("/login")
  public String login(@RequestBody User user) {
    User retrievedUser = proxy.showUser(user.getUserName());
    if(retrievedUser==null)
      return "User not found";
    
    else {
      if(user.getPassword().equals(retrievedUser.getPassword())) {
        return "Welcome, human";
      }
      
      else {
        return "Wrong password";
      }
      
    }
  }
  
}
