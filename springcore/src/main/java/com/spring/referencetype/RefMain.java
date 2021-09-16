package com.spring.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/referencetype/ref.xml");
		  Ajay a = (Ajay) context.getBean("aref");
		  System.out.println(a.getX() + " " + a.getV() +  " " + a.getV().getY() );
	}

}
