package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/students

@RestController
public class StudentController {
	
	@RequestMapping("/students")
	public List<Student> retrieveStudents() {
		return Arrays.asList(
				new Student(0001, "Siddu1", 23, "India"),
				new Student(0002, "Siddu2", 23, "India"),
				new Student(0003, "Siddu3", 23, "India")
				);
	}
}
