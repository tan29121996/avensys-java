package com.demo.springboot.employeewebapp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Employee(1, "sy", 25, "Block 1, Singapore"));
		repository.save(new Employee(2, "sy", 26, "Block 2, Singapore"));
		repository.save(new Employee(3, "sy", 27, "Block 3, Singapore"));
	}

}
