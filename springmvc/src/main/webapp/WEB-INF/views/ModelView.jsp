<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo - modelview</title>
</head>
<body>
<h1>Student detail : </h1>
<h2>Student name : ${name}</h2>
<h2>Student id : ${id} </h2>
<c:forEach items="${marks}" var="i">
<h3>${i}</h3>
</c:forEach>
</body>
</html>