package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone/collections/config.xml");
        Person p = (Person) context.getBean("p1");

        System.out.println(p  + p.getFriends().getClass().getName());
        System.out.println(p.getFeestr() + p.getFeestr().getClass().getName());
	
	}

}
