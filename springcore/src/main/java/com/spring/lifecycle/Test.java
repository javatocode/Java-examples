package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		Pepsi p1 = (Pepsi)context.getBean("p1");
		Jalebi j1 = (Jalebi)context.getBean("j1");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(s1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(p1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(j1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		context.registerShutdownHook();
	}

}
