package com.spring.removeconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class Employee {
	
	@Value("jay")
	private String ename;
	
	@Autowired
	@Qualifier("lemp")
	private List<Integer> rate;
	
	@Autowired
	@Qualifier("memp")
	private Map<String,Integer> marks;
	
	
	static void display2() {
		System.out.println("I am prititng..emp");
	}
	
	

	public Map<String, Integer> getMarks() {
		return marks;
	}



	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}



	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", rate=" + rate + ", marks=" + marks + "]";
	}

	public List<Integer> getRate() {
		return rate;
	}

	public void setRate(List<Integer> rate) {
		this.rate = rate;
	}
	

	
	
}
