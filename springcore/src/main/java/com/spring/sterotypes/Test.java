package com.spring.sterotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sterotypes.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/sterotypes/config.xml");
        Student s = (Student) context.getBean("ob");
        System.out.println("obj1:" + s.hashCode());
        Student s1 = (Student) context.getBean("ob");
        System.out.println("obj2 :" + s1.hashCode());
//        System.out.println(s.getStudAddress().getClass().getName());
//        System.out.println(s.getStudAddress());
	}

}
