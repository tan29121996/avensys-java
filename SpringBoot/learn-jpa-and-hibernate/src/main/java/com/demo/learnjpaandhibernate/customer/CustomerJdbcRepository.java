package com.demo.learnjpaandhibernate.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

@Repository
public class CustomerJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into Customer (id, name, address)
			values(?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
			delete from Customer where id = ?;
			""";
	
	private static String SELECT_QUERY = 
			"""
			select * from Customer where id = ?;
			""";
	
	public void insert(Customer customer) {
		springJdbcTemplate.update(INSERT_QUERY, 
				customer.getId(), customer.getName(), customer.getAddress());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Customer findById(long id)
	{
		return springJdbcTemplate.queryForObject(SELECT_QUERY,
				new BeanPropertyRowMapper<>(Customer.class),id);
	}
}
