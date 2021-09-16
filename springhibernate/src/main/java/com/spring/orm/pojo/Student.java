package com.spring.orm.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "stud_hibernate")
public class Student {
	
	@Id
	@Column(name="stud_id")
	private int sid;
	
	@Column(name="stud_name")
	private String sname;
	
	@Column(name="stud_branch")
	private String sbranch;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Address address;
	
	public int getSid() {
		return sid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", address=" + address + "]";
	}
	

	
}
