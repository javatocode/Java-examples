package com.spring.withoutxml.studentapp1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.config.config;
import com.spring.operation.InsertData;
import com.spring.operation.UpdateData;
import com.spring.pojo.Student;
import com.spring.studentdao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        StudentDao sd = context.getBean("studentdaoimp",StudentDao.class);
        
        int v1;
 		do {	
 			System.out.println("1.Insert  2.update  3.delete  4.Show Record 5.Exit");
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
 			       String zip = sc.next();
 			       Student s = InsertData.insert(sid,sname,sbranch,city,state,zip);
 			       int res = sd.insertdata(s);
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
 		       String stuzip = su.next();
 		       Student s1 = UpdateData.change(stuid, stuname, stubranch, stucity, stustate, stuzip);
 		       int r = sd.updatedata(s1);
 		       if(r == 0) {
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
 		 	   int rd = sd.deletedata(studid);
 		 	   if(rd == 0) {
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
 		 	 Student rr = sd.getonerecord(srid);
 		 	 System.out.println("Roll No : " + rr.getSid());
 		 	 System.out.println("Name : " + rr.getSname());
 		 	 System.out.println("Branch : " + rr.getSbranch());
 		 	 System.out.println("city : " + rr.getAddress().getInfo().get("city"));
 		 	 System.out.println("state : " + rr.getAddress().getInfo().get("state"));
 		 	 System.out.println("zipcode : " + rr.getAddress().getInfo().get("zipcode"));	
 		 	 break;
 		 	
 	    case 5:
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
