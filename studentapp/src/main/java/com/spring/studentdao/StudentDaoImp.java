package com.spring.studentdao;

import java.util.List;
import java.util.Stack;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.pojo.Student;

public class StudentDaoImp implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	public int insertdata(Student stud) {
		// insert student data 
		String query1 = "insert into studentdetail (sid,sname,sbranch,city,state,zipcode) values(?,?,?,?,?,?)";
		int res1 = this.jdbcTemplate.update(query1,stud.getSid(),stud.getSname(),stud.getSbranch(),stud.getAddress().getInfo().get("city"),stud.getAddress().getInfo().get("state"),stud.getAddress().getInfo().get("zipcode"));
		return res1;
	}

	public int updatedata(Student stud) {
		// update data 
		String query1 = "update studentdetail set sname= ? ,sbranch=? , city = ? , state = ? ,zipcode = ?  where sid = ?";
		int res1 = this.jdbcTemplate.update(query1,stud.getSname(),stud.getSbranch(),stud.getAddress().getInfo().get("city"),stud.getAddress().getInfo().get("state"),stud.getAddress().getInfo().get("zipcode"),stud.getSid());
		return res1;
	}
	
	public int deletedata(int dsid) {
		// delete data 
		String query1 = "delete from studentdetail where sid = ?";
		int res1 = this.jdbcTemplate.update(query1,dsid);
		return res1;
	}
	
	public Student getonerecord(int rsid) {
		// show only one record data
		String query1 = "select * from studentdetail where sid = ?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student s1 = this.jdbcTemplate.queryForObject(query1,rowMapper, rsid);
		return s1;
	}
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
