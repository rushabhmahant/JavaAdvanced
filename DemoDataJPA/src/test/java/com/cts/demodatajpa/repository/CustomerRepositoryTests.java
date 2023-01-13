package com.cts.demodatajpa.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.cts.demodatajpa.Customer;
import com.cts.demodatajpa.CustomerRepository;

@DataJpaTest
public class CustomerRepositoryTests {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	@Rollback(false)
	public void saveCustomer() {
		Customer c = new Customer("Rushabh", "Mahant");
		testEntityManager.persist(c);
		Customer persistedCustomer = customerRepository.findByLastName("Mahant").get(0);
		System.out.println("Generated id: " + persistedCustomer.getId());
		Assertions.assertThat(persistedCustomer.getId()).isNotNull();
	}
	
	@Test
	public void findCustomer() {
		Customer c = customerRepository.findById(1);
		Assertions.assertThat(c.getId()).isGreaterThan(0);
	}

}
