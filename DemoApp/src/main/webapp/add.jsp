<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp page</title>
</head>
<body bgcolor="cyan">
<%@ include file="header.jsp" %>
<%
int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));
int k = i * j;
int n = i/j;
%>
Your output : <%=  k %>
Your output by n is : <%= n %>

</body>
</html>