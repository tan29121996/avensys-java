package com.demo.springboot.employeewebapp.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class EmployeeService {
	private static List<Employee> employees = new ArrayList<>();
	
    private static int todosCount = 0;
	
//	static {
//		employees.add(
//		new Employee(++todosCount, "sy", 25, "Block 1, Singapore"));
//		employees.add(
//		new Employee(++todosCount, "sy", 26, "Block 2, Singapore"));
//		employees.add(
//		new Employee(++todosCount, "sy", 27, "Block 3, Singapore"));
//	}
	
	public List<Employee> findByUsername(String username) {
		return employees;
	}
	
	public void addEmployee(String name, int age, String address) {
		Employee employee = new Employee(++todosCount, name, age, address);
		employees.add(employee);
	}
	
	public void deleteById(int id) {
		Predicate<? super Employee> predicate = todo -> todo.getId() == id;
		employees.removeIf(predicate);
	}
	
	public Employee findById(int id) {
		Predicate<? super Employee> predicate = todo -> todo.getId() == id;
		Employee employee = employees.stream().filter(predicate).findFirst().get();
		return employee;
	}

	public void updateEmployee(@Valid Employee employee) {
	    Employee existingEmployee = findById(employee.getId());
	    existingEmployee.setName(employee.getName());
	    existingEmployee.setAge(employee.getAge());
	    existingEmployee.setAddress(employee.getAddress());
	}
}
