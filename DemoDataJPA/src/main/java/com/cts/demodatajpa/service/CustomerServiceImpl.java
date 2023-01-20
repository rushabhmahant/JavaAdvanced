package com.cts.demodatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cts.demodatajpa.CustomerRepository;

@Service
@Primary
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void serviceMethod() {
		System.out.println("Inside service method");
	}

}
