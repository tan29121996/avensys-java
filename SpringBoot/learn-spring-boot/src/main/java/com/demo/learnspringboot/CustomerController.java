package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@RequestMapping("/customers")
	public List<Customer> retrieveCustomers() {
		return Arrays.asList(
				new Customer("Guy1", "City1", 001, 1000),
				new Customer("Guy2", "City2", 002, 2000),
				new Customer("Guy3", "City3", 003, 3000),
				new Customer("Guy4", "City4", 004, 4000)
				);
	}
}
