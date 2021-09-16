package com.spring.operation;


import org.springframework.context.ApplicationContext;


import com.spring.orm.pojo.Address;
import com.spring.orm.pojo.Student;



public class InsertData { 
  public static ApplicationContext context = AddressData.context;	
  static Student s = context.getBean("student",Student.class);
  public static Student insert(int sid, String sname, String sbranch,String scity,String state,int zip){
	  Address a  = AddressData.addressdata(scity, state, zip);
	  s.setSid(sid);
      s.setSname(sname);
      s.setSbranch(sbranch);
      s.setAddress(a);
	return s;
  }
  
 
}
