package com.demo.learnjpaandhibernate.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Long>{

}
