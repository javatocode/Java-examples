package com.spring.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.project")
public class Config {

	@Bean(name= {"adddata"})
    public Map<String,String> addressdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city : ");
		String city = sc.next();
		System.out.println("Enter your state : ");
		String state = sc.next();
		Map<String,String>  mMap = new HashMap<String,String>();
	    mMap.put("city",city);
	    mMap.put("state",state);
	    return mMap;
    }
	
	@Bean(name= {"si"})
	public int sid() {
		System.out.println("Enter your ID : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		return s;
	}
	
	@Bean(name= {"sn"})
	public String sname() {
		System.out.println("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String sname = sc.next();
		return sname;
	}
	
	@Bean(name= {"sm"})
	public Stack<Integer> smarks() {
		    System.out.println("Menu Driven for subjects marks : ");
		    
	        Stack<Integer> s = new Stack<Integer>();
	        int v1;
			do {	
				System.out.println("1.Push  2.Pop  3.Peek  4.Exit ");
			    Scanner ch = new Scanner(System.in);
		        int k = ch.nextInt();
		    switch(k) {
		    case 1:
				    System.out.println("Enter your number of subjects : ");
				    Scanner cp = new Scanner(System.in);
			        int c = cp.nextInt();
			        for (int i = 0; i < c; i++) {
			        	System.out.println("Enter your subject id : " + i + " marks ");
			            Scanner sc = new Scanner(System.in);
			            int d = sc.nextInt();
			            s.push(d);
			        }
			        break;
		    case 2:
		    	int y = s.pop();
		        System.out.println("This subject marks is remove : " + y);
		        break;
		        
		    case 3:
		    	int x = s.peek();
		        System.out.println("Top most marks in statck : " + x);
		        break;
			        
		    }
		    System.out.println("Do you want to continue :1. yes 2. no");
 			Scanner ch1 = new Scanner(System.in);
 			v1 = ch1.nextInt();
	    }while(v1 == 1);
	        return s;
	}
}
