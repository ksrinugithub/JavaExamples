package com.SpringBoot.service;

import org.springframework.stereotype.Component;
@Component
public class NonVeg implements Pizza {
	public String getPizza() {
		return "This Is non-Veg Pizza";
	}

}
