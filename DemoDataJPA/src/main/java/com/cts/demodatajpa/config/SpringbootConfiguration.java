package com.cts.demodatajpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.demodatajpa.Customer;

@Configuration
public class SpringbootConfiguration {
	
	@Bean
	public Customer getBean() {
		System.out.println("CREATING CUSTOMER BEAN !!!");
		return new Customer("Configuration", "Test");
	}

}
