package com.spring.operation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;

import com.spring.pojo.Student;

public class UpdateData {
	static ApplicationContext context = InsertData.context;
	public static Student change(int sid, String sname, String sbranch, String city, String state, String zip){
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
		return s;
	  }
}
