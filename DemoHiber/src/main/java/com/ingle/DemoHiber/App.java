package com.ingle.DemoHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
// embeddable object ref to main class
		
    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Hp");
//    	
//    	
    	StudName sn = new StudName();
//    	sn.setFname("Ajay");
//    	sn.setMname("Balppa");
//    	sn.setLname("Ingle");
////    	
    	Student stu = new Student();
//    	stu.setSid(2);
//    	stu.setSname(sn);
//    	stu.setScity(" Mumbai");
//    	stu.setSphone("8798813098");
    	
    	// assign laptop to student
//    	stu.setLaptop(laptop);
    	
    	// multiple laptop to one student
    	stu.getLaptop().add(laptop);
//    	laptop.setStudent(stu);
    		
    	// multiple laptop to multiple student
    	
    	laptop.getStudent().add(stu);
    	
    	Configuration  con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	// if hibernate version is not update then your buildsessionfactory has over line 
    	// so we use here to remove serviceregistry
    	
    	// ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	// pass reg to buildsessionfactory
    	
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	
    	Session session = sf.openSession(); // create session object
    	
    	// mainatin query for cache
//    	Query q1 = session.createQuery("from Student where sid=1");
//    	q1.setCacheable(true);
//    	Student a = (Student) q1.uniqueResult();
    	
    	
    	// to maintain ACID property
    	
    	Transaction tx = session.beginTransaction();
//    	session.save(stu);
//    	session.save(laptop);
//    	
    	// fetch data from database
    	
//    	stu = (Student)session.get(Student.class, 1);
//    	System.out.println(a);
    	
//    	Session session1 = sf.openSession();
//        Query q2 = session1.createQuery("from Student where sid=1");
//        q2.setCacheable(true);
//    	Student b = (Student) q2.uniqueResult();
//    	stu = (Student)session1.get(Student.class, 1);
//    	System.out.println(b);
    	
    	// get all student data
    	
    	Session session4 = sf.openSession();
//    	Query q = session3.createQuery("from Student where sid=1 ");
//    	Query q3 = session4.createQuery("select fname from Student where sid=1 ");
//    	Student stw = (Student)q.uniqueResult();
    	// List<Student> stuw = q.list();
//    	System.out.println(stw);

//    	Object[] student = (Object[]) q3.uniqueResult();
//    	for(Object s : student) {
//		System.out.println(s);
//	     }
    	

    	
    	
    	
    	tx.commit();
//    	System.out.println(stu);
    }
}
