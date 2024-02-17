package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBoot.controller.PizzaController;
import com.SpringBoot.service.Pizza;

@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBoot.controller")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ap = SpringApplication.run(Test.class, args);
		System.out.println("calling pizzaController.getPizza()");
		PizzaController pizzaController = ap.getBean(PizzaController.class);
		String message = pizzaController.getPizza();
		System.out.println(message);
	}
}