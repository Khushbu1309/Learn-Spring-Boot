package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
		System.out.println("Welcome to Learn Spring Boot");
		
//		 SpringApplication app = new SpringApplication(LearnSpringBootApplication.class);
//	        app.setDefaultProperties(Collections
//	          .singletonMap("server.port", "8083"));
//	        app.run(args);

		
	}

}
