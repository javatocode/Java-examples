package com.spring.orm.hibernate;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.operation.InsertData;
import com.spring.operation.UpdateData;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.pojo.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao  sd = context.getBean("studentdaoimp",StudentDao.class);
        int v1;
		do {	
			System.out.println("1.Insert  2.update  3.delete  4.Show Record 5.All Record  6.Exit");
		    Scanner ch = new Scanner(System.in);
	        int k = ch.nextInt();
	    switch(k) {
	    case 1:
			       System.out.println("Insert student data : ");
			       Scanner sc = new Scanner(System.in);
			 	   System.out.println("Enter your roll no :");
			 	   int sid = sc.nextInt();
			 	   System.out.println("Enter your name :");
			       String sname = sc.next();
			       System.out.println("Enter your branch :");
			       String sbranch = sc.next();
			       System.out.println("Enter your City :");
			       String city = sc.next();
			 	   System.out.println("Enter your State :");
			       String state = sc.next();
			       System.out.println("Enter your Zipcode :");
			       int zip = sc.nextInt();
			       
			       Student si = InsertData.insert(sid,sname,sbranch,city,state,zip);
			       int res = sd.insertdata(si);
			       if(res == 0) {
			    	   System.out.println("Data is not inserted !");
			       }
			       else {
			    	   System.out.println("Data is add successfully !!");
			       } 
		        break;
	    case 2:
	    	   System.out.println("Update student data : ");
		       Scanner su = new Scanner(System.in);
		 	   System.out.println("Enter your roll no :");
		 	   int stuid = su.nextInt();
		 	   System.out.println("Enter your name :");
		       String stuname = su.next();
		       System.out.println("Enter your branch :");
		       String stubranch = su.next();
		       System.out.println("Enter your City :");
		       String stucity = su.next();
		 	   System.out.println("Enter your State :");
		       String stustate = su.next();
		       System.out.println("Enter your Zipcode :");
		       int stuzip = su.nextInt();
		       Student s1 = UpdateData.change(stuid, stuname, stubranch,stucity,stustate,stuzip);
		       boolean r = sd.updatedata(s1);
		       if(r == false) {
		    	   System.out.println("Data is not updated !");
		       }
		       else {
		    	   System.out.println("Data is updated successfully !!");
		       } 
	        break;
	        
	    case 3:
	    	   System.out.println("Delete student Record : ");
		       Scanner sdl = new Scanner(System.in);
		 	   System.out.println("Enter your roll no :");
		 	   int studid = sdl.nextInt();
		 	   boolean rd = sd.deletedata(studid);
		 	   if(rd == false) {
		    	   System.out.println("Data is not deleted !");
		       }
		       else {
		    	   System.out.println("Data is deleted successfully !!");
		       }
	        break;
	      
	    case 4:
	    	 System.out.println("Show student Record : ");
	    	 Scanner sr = new Scanner(System.in);
		 	 System.out.println("Enter your roll no :");
		 	 int srid = sr.nextInt();
		 	 Student rr = sd.getonestudata(srid);
		 	 System.out.println("Roll No : " + rr.getSid());
		 	 System.out.println("Name : " + rr.getSname());
		 	 System.out.println("Branch : " + rr.getSbranch());
		 	 System.out.println("city : " + rr.getAddress().getCity());
		 	 System.out.println("state : " + rr.getAddress().getState());
		 	 System.out.println("zipcode : " + rr.getAddress().getZipcode());
		 	 break;
		 	
	    case 5:
	    	System.out.println("Show all student Record : ");
		 	 List<Student> rs = sd.getallstudata();
		 	 for (Student i : rs) {
		 	 System.out.println("Roll No : " + i.getSid());
		 	 System.out.println("Name : " + i.getSname());
		 	 System.out.println("Branch : " + i.getSbranch());
		 	 System.out.println("city : " + i.getAddress().getCity());
		 	 System.out.println("state : " + i.getAddress().getState());
		 	 System.out.println("zipcode : " + i.getAddress().getZipcode());
		 	 }
		 	 break;
	    	
	    case 6:
	    	System.out.println("Student App is closed. ");
	    	System.exit(0);
	    	break;
	    }
	    System.out.println("Do you want to continue :1. yes 2. no");
		Scanner ch1 = new Scanner(System.in);
		v1 = ch1.nextInt();
   }while(v1 == 1);
    }
}
