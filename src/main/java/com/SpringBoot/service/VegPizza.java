package com.SpringBoot.service;

import org.springframework.stereotype.Component;
@Component
public class VegPizza implements Pizza {

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "This is VegPizza";
	}

}
