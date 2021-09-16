<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.Connection ,java.sql.DriverManager,java.sql.Statement,java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mysql student data</title>
</head>
<body>
<%
    // load the driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    // create the connection..
    String user = "root";
    String password = "Lufa@7917";
    String url = "jdbc:mysql://localhost:3307/student_manage";
    String sql = "select * from students where sid=1";
    String usql = "select * from students";
    Connection con = DriverManager.getConnection(url,user,password);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql);
    rs.next();
    try{
    Statement stq = con.createStatement();
    ResultSet rsql = stq.executeQuery(usql);
    while (rsql.next()) {
        int id = rsql.getInt(1);
        String name = rsql.getString("sname");
        String phone = rsql.getString("sphone");
        String city = rsql.getString("scity");
        out.println("Students Details :" + "<br>");
        out.println("Id : " + id + "<br>");
        out.println("Name:" + name + "<br>");
        out.println("Phone: " + phone + "<br>");
        out.println("city: " + city + "<br>");
        out.println("+++++++++++++++++++++++++++++++" + "<br>");
    }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
%>
<br>
id => <%= rs.getInt(1) %><br>
name => <%= rs.getString("sname") %><br>
phone => <%= rs.getString("sphone") %><br>
city => <%= rs.getString("scity") %><br>
</body>
</html>