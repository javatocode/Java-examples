package com.spring.operation;


import org.springframework.context.ApplicationContext;

import com.spring.orm.pojo.Address;
import com.spring.orm.pojo.Student;



public class UpdateData {
	static ApplicationContext context = AddressData.context;
	public static Student change(int sid, String sname, String sbranch,String scity,String state,int zip){
		  Student s = context.getBean("student",Student.class);
		  Address a  = AddressData.addressdata(scity, state, zip);
		  s.setSid(sid);
	      s.setSname(sname);
	      s.setSbranch(sbranch);
	      s.setAddress(a);
		return s;
	  }
}
