package com.demo.learnjpaandhibernate.customer;

import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Customer customer) {
		entityManager.merge(customer);
	}
	
	public Customer findById(long id) {
		return entityManager.find(Customer.class, id);
	}
	
	public void deleteById(long id) {
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.remove(customer);
	}
}
