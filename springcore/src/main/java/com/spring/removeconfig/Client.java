package com.spring.removeconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spel.Demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student d = c.getBean("stu",Student.class);
		Employee e = c.getBean("emp1",Employee.class);
		d.display();
		e.display2();
		System.out.println(e.getEname());
		System.out.println(e.getRate());
		System.out.println(e.getMarks());
	}

}
