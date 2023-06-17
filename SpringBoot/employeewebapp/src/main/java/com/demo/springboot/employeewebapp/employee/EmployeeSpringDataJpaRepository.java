package com.demo.springboot.employeewebapp.employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSpringDataJpaRepository extends JpaRepository<Employee, Long>{

}
