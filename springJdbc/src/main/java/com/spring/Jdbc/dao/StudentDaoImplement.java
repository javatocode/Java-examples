package com.spring.Jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.Jdbc.modal.Student;

@Component("studentdao")
public class StudentDaoImplement implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		String query = "insert into student(sname,scity) values(?,?)";
		int res = this.jdbcTemplate.update(query,student.getSname(),student.getScity());
		return res;
	}
	
	public int change(Student student) {
		String query = "update student set sname=? , scity=? where sid = ? ";
		int res = this.jdbcTemplate.update(query,student.getSname(),student.getScity(),student.getSid());
		return res;
	}

	public int delete(int studid) {
		String query = "delete from student where sid = ? ";
		int res = this.jdbcTemplate.update(query,studid);
		return res;
	}
	
	public Student getstudent(int student) {
		// TODO Auto-generated method stub
		String query = "select * from student where sid=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student student1 = this.jdbcTemplate.queryForObject(query,rowMapper, student);
		return student1;
	}
	
	public List<Student> getallstudent() {
		String query = "select * from student";
		List<Student> student1 = this.jdbcTemplate.query(query,new RowMapperImp());
		return student1;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	
}
