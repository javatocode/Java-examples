package com.spring.project;

import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Autowired
	@Qualifier("sn")
	private String sname;
	
	@Autowired
	@Qualifier("sm")
	private Stack<Integer> marks;
	
	@Autowired
	@Qualifier("si")
	private int sid;
	
	@Autowired
	@Qualifier("add")
	private Address address;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Stack<Integer> getMarks() {
		return marks;
	}
	public void setMarks(Stack<Integer> marks) {
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(String sname, Stack<Integer> marks, int sid, Address address) {
		super();
		this.sname = sname;
		this.marks = marks;
		this.sid = sid;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + ", sid=" + sid + ", address=" + address + "]";
	}
	
}
