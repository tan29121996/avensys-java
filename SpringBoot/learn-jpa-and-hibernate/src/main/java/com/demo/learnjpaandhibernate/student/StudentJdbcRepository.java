package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

@Repository
public class StudentJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			insert into Student (id, name, address)
			values(?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
			delete from Student where id = ?;
			""";
	
	private static String SELECT_QUERY = 
			"""
			select * from Student where id = ?;
			""";
	
	public void insert(Student student) {
		springJdbcTemplate.update(INSERT_QUERY, 
				student.getId(), student.getName(), student.getAddress());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Student findById(long id)
	{
		return springJdbcTemplate.queryForObject(SELECT_QUERY,
				new BeanPropertyRowMapper<>(Student.class),id);
	}
}
