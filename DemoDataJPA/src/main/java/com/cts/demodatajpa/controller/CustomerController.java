package com.cts.demodatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demodatajpa.service.CustomerService;
import com.cts.demodatajpa.service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/test")
	public void controllerMethod(){
		System.out.println("Inside service method");
		//customerService.serviceMethod();
	}

}
