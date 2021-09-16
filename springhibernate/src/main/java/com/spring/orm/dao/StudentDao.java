package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.pojo.Student;

public interface StudentDao {
	public int insertdata(Student student);
	public Student getonestudata(int stuid );
	public List<Student> getallstudata();
	public boolean deletedata(int stuid);
	public boolean updatedata(Student student);
	
}
