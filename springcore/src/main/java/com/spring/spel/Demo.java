package com.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Demo {
	
	@Value("3")
	private int x;
	@Value("2")
	private int y;
	
	@Value("#{T(com.spring.spel.Addition).add(10,20)}")
	private int addres;
	
	@Value("#{T(com.spring.spel.Addition).n}")
	private String n;
	
	
	
	 @Value("#{new java.lang.Integer(100) }") 
	 private int marks;
	 
	@Value("#{8>0}")
	private boolean isActive;


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAddres() {
		return addres;
	}


	public void setAddres(int addres) {
		this.addres = addres;
	}


	public String getN() {
		return n;
	}


	public void setN(String n) {
		this.n = n;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", addres=" + addres + ", n=" + n + ", marks=" + marks + ", isActive="
				+ isActive + "]";
	}
	
	
	

	

	

	
	

}
