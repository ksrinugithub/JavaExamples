package com.SpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringBoot.service.Pizza;

@Configuration
public class configurtion {
	@Bean(name="vegPizza")
	public String vegPizza() {
		return "VegPizza";
		
	}
	

}
