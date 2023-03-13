package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringBootApplication.class, args);
//		System.out.println("Welcome to Learn Spring Boot");
		ConfigurableApplicationContext context=SpringApplication.run(LearnSpringBootApplication.class, args); 
		Student_Info obj=context.getBean(Student_Info.class);
		obj.show();
//		 SpringApplication app = new SpringApplication(LearnSpringBootApplication.class);
//	        app.setDefaultProperties(Collections
//	          .singletonMap("server.port", "8083"));
//	        app.run(args);

		
	}

}
