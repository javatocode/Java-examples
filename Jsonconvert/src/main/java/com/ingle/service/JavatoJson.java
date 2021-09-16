package com.ingle.service;

import java.util.ArrayList;
import java.util.List;

import com.ingle.modal.Address;
import com.ingle.modal.Student;

public class JavatoJson {
  public static Student javatojsonconvert() {
	  Student student = new Student();
	  student.setSid(100);
	  student.setSname("Ajay");
	  student.setSubject(setsubject(student));
	  student.setAddress(setadddetail(student));
	  return student;
  }
  
  public static List<String> setsubject(Student s){
	  List<String> sub = new ArrayList<String>();
	  sub.add("DSA");
	  sub.add("DBMS");
	  sub.add("CN");
	  return sub;
  }
  
  public static Address setadddetail(Student s){
	  Address addr = new Address();
	  addr.setCity("Mumbai");
	  addr.setZipcode(1001);
	  return addr;
  }
}
