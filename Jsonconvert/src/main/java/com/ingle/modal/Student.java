package com.ingle.modal;

import java.util.List;

public class Student {
	private int sid;
	private String sname;
	private List<String> subject;
	private Address address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int sid, String sname, List<String> subject, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.subject = subject;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", subject=" + subject + ", address=" + address + "]";
	}

}
