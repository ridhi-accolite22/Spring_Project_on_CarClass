package com.accolite.spring.example.demo1;

import com.accolite.spring.example.demo1.config.CarConfig;
import com.accolite.spring.example.demo1.controller.CarController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo1Application.class, args);
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(CarConfig.class);
		CarController controller=con.getBean(CarController.class);
		controller.getToyota();
	}

}
