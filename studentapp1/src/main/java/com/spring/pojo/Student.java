package com.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Student {
	private int sid;
	private String sname;
	private String sbranch;
	
	@Autowired
	@Qualifier("add")
	private Address address;
	
	public int getSid() {
		return sid;
	}
	public int setSid(int sid) {
		return this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getAddress() {
		return address;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Student(int sid, String sname, String sbranch, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		this.address = address;
	
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", address=" + address
				+ "]";
	}
	
	
}
