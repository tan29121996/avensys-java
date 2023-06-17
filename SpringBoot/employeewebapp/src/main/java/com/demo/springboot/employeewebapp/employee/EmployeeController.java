package com.demo.springboot.employeewebapp.employee;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class EmployeeController {
	private EmployeeService employeeService;
	
	private final EmployeeSpringDataJpaRepository repository;
	
	public EmployeeController(EmployeeService employeeService, EmployeeSpringDataJpaRepository repository) {
		super();
		this.employeeService = employeeService;
		this.repository = repository;
	}

	@RequestMapping("employee-list")
	public String listAllEmployees(ModelMap model) {
		List<Employee> employees = repository.findAll();
		model.addAttribute("employees", employees);
		return "employeelist";
	}
	
	@RequestMapping(value = "add-employee", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String name = (String) model.get("name");
		Employee employee = new Employee(0, name, 0, "");
		model.put("employee", employee);
		return "employee";
	}
	
	@RequestMapping(value = "add-employee", method = RequestMethod.POST)
	public String addNewEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return "employee";
		}
		String name = (String) model.get("name");
		employeeService.addEmployee(name, employee.getAge(), employee.getAddress());
		return "redirect:employee-list";
	}
	
	@RequestMapping("delete-employee")
	public String deleteEmployee(@RequestParam int id) {
		employeeService.deleteById(id);
		return "redirect:employee-list";
	}
	
	@RequestMapping(value = "update-employee", method = RequestMethod.GET)
	public String showUpdateEmployeePage(@RequestParam int id, ModelMap model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "employee";
	}
	
	@RequestMapping(value = "update-employee", method = RequestMethod.POST)
	public String updateEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return "employee";
		}

	    String name = (String) model.get("name");
	    employee.setName(name);

		employeeService.updateEmployee(employee);
		return "redirect:employee-list";
	}
}
