package com.spring.constructor;

import java.util.List;
import java.util.Map;

public class Person {
	private int pid;
	private String pname;
	private Address add;
	private List<String> pcourse;
	private Map<String,Integer> marks;
	public Person(int pid, String pname, Address add, List<String> pcourse, Map<String, Integer> marks) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add = add;
		this.pcourse = pcourse;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", add=" + add + ", pcourse=" + pcourse + ", marks=" + marks
				+ "]";
	}
	
	
	
	
}
