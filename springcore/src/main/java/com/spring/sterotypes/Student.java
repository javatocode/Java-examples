package com.spring.sterotypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("1001")
	private int StudId;
	@Value("sanju")
	private String StudName;
	@Value("#{t1}")
	private List<String> StudAddress;
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public List<String> getStudAddress() {
		return StudAddress;
	}
	public void setStudAddress(List<String> studAddress) {
		StudAddress = studAddress;
	}
	public Student(int studId, String studName, List<String> studAddress) {
		super();
		StudId = studId;
		StudName = studName;
		StudAddress = studAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudName=" + StudName + ", StudAddress=" + StudAddress + "]";
	}
	
	
}
