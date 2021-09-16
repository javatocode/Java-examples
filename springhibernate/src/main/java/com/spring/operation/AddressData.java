package com.spring.operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.pojo.Address;
import com.spring.orm.pojo.Student;

public class AddressData {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");	
	  static Student s = context.getBean("student",Student.class);
	  public static Address addressdata(String scity,String state,int zip) {
		  Address a = s.getAddress();
		  a.setCity(scity);
		  a.setState(state);
		  a.setZipcode(zip);
		  return a;
	  }
}
