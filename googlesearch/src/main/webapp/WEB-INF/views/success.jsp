<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<script src="<c:url value="/vendor/js/main.js" />" ></script>
    <title>Profile</title>
</head>
<body>


<div class="container">
<div class="card mx-auto mt-5" style="width:600px;">
  <div class="card-header">
    Featured
  </div>
  <div class="row">
  <div class="col-sm-6" style="padding: 80px"> 
  	<div class="card" style="box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);">
  	<div class="card-body">
     <img alt="users" src="<c:url value="/vendor/users/${data.profile.getOriginalFilename()}" />" class="img-fluid " style="width: 200px;">
  </div>
  </div>
  </div>
  <div class="col-sm-6">
    <div class="card-body">
    	<p><b>Name : </b>${data.name}</p>
    	<p><b>Email : </b>${data.email}</p>
    	<p><b>City : </b>${data.address.city}</p>
    	<p><b>State : </b>${data.address.state}</p>
    	<p><b>Gender : </b>${data.name}</p>
    	<p><b>DOB : </b>${data.date}</p>
    	<p><b>Your Like Engine : </b>${data.fengine}</p>
<%-- ${data.profile.getOriginalFilename()}<br>
${data.profile.getOriginalFilename()}<br> --%>
<br>
    <a href="home" class="btn btn-primary">Go back</a>
  </div>
  </div>
</div>
</div>
</body>
</html>