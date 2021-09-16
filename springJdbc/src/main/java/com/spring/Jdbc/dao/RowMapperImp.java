package com.spring.Jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.Jdbc.modal.Student;

public class RowMapperImp implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setSid(rs.getInt(1));
		student.setSname(rs.getString(2));
		student.setScity(rs.getString(3));
		return student;
	}

}
