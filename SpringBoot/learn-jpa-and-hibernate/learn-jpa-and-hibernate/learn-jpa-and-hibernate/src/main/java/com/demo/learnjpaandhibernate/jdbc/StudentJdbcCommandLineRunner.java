package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.student.Student;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepository;
import com.demo.learnjpaandhibernate.student.springdatajpa.StudentSpringDataJpaRepository;

@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private StudentJdbcRepository repository;
	
//	@Autowired
//	private StudentJpaRepository repository;
	
	@Autowired
	private StudentSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Student(1,"Silas","Singapore"));
		repository.save(new Student(2,"Rish","LA"));
		repository.save(new Student(3,"James","New York"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
	}
	

}
