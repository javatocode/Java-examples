package com.spring.Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.Jdbc.dao.StudentDao;
import com.spring.Jdbc.modal.Student;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        JdbcTemplate template = context.getBean("jdbcTemplate" , JdbcTemplate.class);
    
        StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
        
        Student stu = new Student();
//        stu.setSname("dagadu");
//        stu.setScity("Delhi");
//        stu.setSid(126);
//        int result = studentdao.insert(stu);
//        int result1 = studentdao.change(stu);
//        System.out.println("Student added " + result);
//        System.out.println("Student added " + result1);
//          Student student = studentdao.getstudent(123);
//          int result1 = studentdao.delete(123);
//          System.out.println(result1);
        List<Student> students = studentdao.getallstudent();
        for(Student s : students) {
        	System.out.println(s);
        }
    }
}
