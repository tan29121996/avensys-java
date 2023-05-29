package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.customer.Customer;
import com.demo.learnjpaandhibernate.customer.CustomerJdbcRepository;
import com.demo.learnjpaandhibernate.customer.CustomerJpaRepository;
import com.demo.learnjpaandhibernate.customer.CustomerSpringDataJpaRepository;
import com.demo.learnjpaandhibernate.student.Student;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepository;
import com.demo.learnjpaandhibernate.student.springdatajpa.StudentSpringDataJpaRepository;

@Component
public class CustomerCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CustomerJdbcRepository repository;
	
//	@Autowired
//	private CustomerJpaRepository repository;
	
//	@Autowired
//	private CustomerSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Customer(1, "Siddu", "India"));
		repository.insert(new Customer(2, "Nithin", "India"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
	}
	
}
