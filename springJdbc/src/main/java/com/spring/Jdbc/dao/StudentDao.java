package com.spring.Jdbc.dao;

import java.util.List;

import com.spring.Jdbc.modal.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int sid);
	public Student getstudent(int sid);
	public List<Student> getallstudent();
}
