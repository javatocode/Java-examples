<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My value : </h1>
<c:forEach items="${students}" var="s">
${s.name}<br>
${s.rollno}<br>
</c:forEach>
  
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3307/student_manage"  
     user="root"  password="Lufa@7917"/>  
</body>
<sql:query dataSource="${db}" var="rs">  
SELECT * from students; 
</sql:query>  
<c:forEach var="stu" items="${rs.rows}">
<c:out value="${stu.sid }"></c:out><br>
<c:out value="${stu.sname }"></c:out><br>
<c:out value="${stu.sphone }"></c:out><br>
<c:out value="${stu.scity }"></c:out><br>
</c:forEach>
</html>