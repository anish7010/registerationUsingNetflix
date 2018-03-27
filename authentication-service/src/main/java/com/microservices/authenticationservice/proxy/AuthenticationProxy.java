package com.microservices.authenticationservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.authenticationservice.entity.User;


@FeignClient(name="registeration-service", url="http://localhost:8000")
public interface AuthenticationProxy {
  
  @GetMapping("/users/{uName}")
  public User showUser(@PathVariable("uName") String uName);
  
}
