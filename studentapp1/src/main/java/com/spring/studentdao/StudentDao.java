package com.spring.studentdao;
import com.spring.pojo.Student;

public interface StudentDao {
     public int insertdata(Student stud);
     public int updatedata(Student stud);
     public int deletedata(int dsid);
     public Student getonerecord(int rsid);
     
}