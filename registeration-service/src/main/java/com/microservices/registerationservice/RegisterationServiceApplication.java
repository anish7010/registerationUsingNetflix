package com.microservices.registerationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RegisterationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterationServiceApplication.class, args);
	}
}
