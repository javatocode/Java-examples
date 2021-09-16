package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.pojo.Student;

public class StudentDaoImp implements StudentDao{
private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insertdata(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	// get studdata
	public Student getonestudata(int stuid) {
		// TODO Auto-generated method stub
		Student student = this.hibernateTemplate.get(Student.class,stuid);
		return student;
	}
	
	// get list of student data 
	public List<Student> getallstudata() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	
    // delete student data
	@Transactional 
	public boolean deletedata(int stuid) {
		Student student = this.hibernateTemplate.get(Student.class,stuid);
		this.hibernateTemplate.delete(student);
		return true;
	}
	
	// update student data
	@Transactional
	public boolean updatedata(Student student) {
		hibernateTemplate.update(student);
		return true;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

}
