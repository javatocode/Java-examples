package com.spring.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Student;

public class InsertData { 
  public static ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config/config.xml");	
  
  public static Student insert(int sid, String sname, String sbranch, String city, String state, String zip){
	  Student s = context.getBean("student",Student.class);
      int d = s.setSid(sid);
      s.setSname(sname);
      s.setSbranch(sbranch);
      Map<String,String>  mMap = new HashMap<String,String>();
	  mMap.put("city",city);
	  mMap.put("state",state);
	  mMap.put("zipcode",zip);
	  mMap.put("sid",Integer.toString(d));
	  s.getAddress().setInfo(mMap);
	  System.out.println(s);
	return s;
  }
}
