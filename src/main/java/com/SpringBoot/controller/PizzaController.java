package com.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.SpringBoot.service.Pizza;

@Component
public class PizzaController {
	@Autowired
	@Qualifier(value = "VegPizza")
	private Pizza pizza;

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getPizza() {
		return pizza.getPizza();

	}

}
