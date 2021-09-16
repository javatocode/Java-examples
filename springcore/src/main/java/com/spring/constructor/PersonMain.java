package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructor/constructor.xml");
	Person p = (Person) context.getBean("person");
	Addition a = (Addition) context.getBean("add");
	System.out.println(p);
	a.dosum();
}
}