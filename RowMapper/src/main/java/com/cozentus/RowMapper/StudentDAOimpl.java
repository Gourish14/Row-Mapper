package com.cozentus.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentDAOimpl implements RowMapper<Student>{
	
	@Override
	public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Student st = new Student();
        st.setId(resultSet.getInt("id"));
        st.setName(resultSet.getString("name"));
        st.setScore(resultSet.getDouble("score"));
        return st;
    }
}
