package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/empconfig.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println(emp1.getName() + "  " + emp1.getAddresses()+ "  " + emp1.getCourses() + "  "+ emp1.getPhones());
	
	}

}
