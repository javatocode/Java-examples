package com.ingle.web.dao;
import java.sql.*;

import com.ingle.web.conn.JdbcConn;
import com.ingle.web.model.Student;
import java.sql.Connection;
public class StudentDao {

	public Student getStudent(int sid) {
		Student s = new Student();
		try {
			Connection con = JdbcConn.createConn();
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery("select * from students where sid=" + sid);
			if(rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setSphone(rs.getString("sphone"));
				s.setScity(rs.getString("scity"));		
			}
			else {
				System.out.println("Do not have entry");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		return s;
	}
	
	
	

	public Student postStudent(String stuname, String stuphone, String stucity) {
		// TODO Auto-generated method stub
		Student s = new Student();
		try {
			Connection con = JdbcConn.createConn();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1,stuname);
            pst.setString(2, stuphone);
            pst.setString(3, stucity);
            pst.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}


	public Student updateStudent(int stuid, String stuname, String stuphone, String stucity) {
		// TODO Auto-generated method stub
		Student s = new Student();
		try {
			Connection con = JdbcConn.createConn();
			String q = "update students set sname=? , sphone=?, scity=? where sid=?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1,stuname);
            pst.setString(2, stuphone);
            pst.setString(3, stucity);
            pst.setInt(4, stuid);
            pst.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}


	public Student delelteStudent(int sid) {
		Student s = new Student();
		try {
			Connection con = JdbcConn.createConn();
			String q = "delete from students where sid=?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setInt(1,sid);
            s.setSid(sid);
            pst.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}




	
	
	
}
