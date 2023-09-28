package com.cozentus.RowMapper;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public StudentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
	public List<Student> getAllStudent() {
        String sql = "select * from students";
        return jdbcTemplate.query(sql, new StudentDAOimpl());
	}
}
