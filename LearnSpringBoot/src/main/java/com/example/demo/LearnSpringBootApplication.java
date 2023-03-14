package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		
		//Start Spring Boot
		/*
		 * SpringApplication.run(LearnSpringBootApplication.class, args);
		 * System.out.println("Welcome to Learn Spring Boot");
		 */
		
		
		//call a other class function using @Component object creation 
		
		
		/*
		 * ConfigurableApplicationContext
		 * context=SpringApplication.run(LearnSpringBootApplication.class, args);
		 * Student_Info obj=context.getBean(Student_Info.class); obj.show();
		 */
		 
		 // call consructor using prehand object provided by spring  singleton design pattern 
//		  ConfigurableApplicationContext
//		  context=SpringApplication.run(LearnSpringBootApplication.class, args);
		  
		  
		  //singleton method create object only once by default

			  ConfigurableApplicationContext
			  context=SpringApplication.run(LearnSpringBootApplication.class, args);
			  Student_Info obj=context.getBean(Student_Info.class); 
			  obj.show();
//			  Student_Info obj1=context.getBean(Student_Info.class); 
//			  obj.show();
			 
		
		
			  //Prototype method create object only when youcall getbean() create instance
				/*
				 * ConfigurableApplicationContext
				 * context=SpringApplication.run(LearnSpringBootApplication.class, args);
				 * Student_Info obj=context.getBean(Student_Info.class); obj.show();
				 * Student_Info obj1=context.getBean(Student_Info.class); obj.show();
				 */
			
		
		
		
		//Port change code
		/*
		 * SpringApplication app = new
		 * SpringApplication(LearnSpringBootApplication.class);
		 * app.setDefaultProperties(Collections .singletonMap("server.port", "8083"));
		 * app.run(args);
		 */
		
	}

}
