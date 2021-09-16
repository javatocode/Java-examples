<%@page import="com.ingle.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <title>Student Get Data</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="css/index.css">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/simple-line-icons/2.4.1/css/simple-line-icons.min.css" rel="stylesheet">
    
</head>

<body>

<div class="container">
	<br><br>
    <div class="card">
      <div class="card-header">
 Student Deatils: 
      </div>
      <div class="card-body" >
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">City</th>
      <th scope="col">Phone</th>
    </tr>
  </thead>
  <tbody>
  <%
	Student s =(Student)request.getAttribute("data");
  %>
    <tr>
      <td >
      <% 
      if(s.getSid()==0){
  		out.println("No records found..");
  	  }
      else{
    	  out.println(s.getSid());
      }
       %>
      </td>
	   <td >
      <% 
      if(s.getSname()==null){
  		
  	  }
      else{
    	  out.println(s.getSname());
      }
       %>
      </td>
       <td >
      <% 
      if(s.getScity()==null){
  		
  	  }
      else{
    	  out.println(s.getScity());
      }
       %>
      </td>
        <td >
      <% 
      if(s.getSphone()==null){
  		
  	  }
      else{
    	  out.println(s.getSphone());
      }
       %>
      </td>
    </tr>
  </tbody>
</table>
  
    </div>
    </div>
 </div>



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
     
</body>

</html>
