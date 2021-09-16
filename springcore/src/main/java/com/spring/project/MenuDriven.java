package com.spring.project;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
     Student s = context.getBean("stud",Student.class);
     System.out.println("Student ID : " + s.getSid());
     System.out.println("Student name : " + s.getSname());
     System.out.println("Student city : " + s.getAddress().getInfo().get("city"));
     System.out.println("Student state : " + s.getAddress().getInfo().get("state"));
     System.out.println("Student Marks : " + s.getMarks());
	}

}
