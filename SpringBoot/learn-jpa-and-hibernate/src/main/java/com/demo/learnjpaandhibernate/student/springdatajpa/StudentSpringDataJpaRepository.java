package com.demo.learnjpaandhibernate.student.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnjpaandhibernate.customer.Customer;

public interface StudentSpringDataJpaRepository extends JpaRepository<Customer, Long>{

}
