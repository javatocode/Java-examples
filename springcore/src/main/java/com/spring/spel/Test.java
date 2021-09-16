package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("com/spring/spel/config.xml");
		Demo demo = c.getBean("obj",Demo.class);
		int res = demo.getX() + demo.getY();
		System.out.println(demo);
		System.out.println(demo.getAddres());
		System.out.println(demo.getN());
		System.out.println(demo.getMarks());
	    System.out.println(demo.isActive());
	}

}
