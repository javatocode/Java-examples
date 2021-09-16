<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link rel="stylesheet" href="<c:url value="/vendor/css/style.css" />" >
	<script src="<c:url value="/vendor/js/main.js" />" ></script>
    <title>Search App</title>
  </head>
  <body style="background: url('<c:url value='/vendor/img/back-search.jpeg' />'); background-size: cover; background-repeat: no-repeat;">
  <div class="container">
  
  <div class="card mx-auto mt-5" style="width: 400px;">
  <div class="container-fluid text-right mt-3">

  <button class="btn btn-danger"  style="width:90px">Login</button>
  <a href="reg"><button class="btn btn-primary"  style=" width:90px">Register</button></a>
  </div>
  <div class="container text-center img-con">
  <img alt="logo" src="<c:url value="/vendor/img/search.jpg" />" class="img-fluid logo ">
  </div>
  <h4 class="text-center text-black"><b>Your choice Search </b></h4>
  
  <div class="card-body py-5 bg-warning" >
    <form action="search" class="mt-3" >
    <div class="form-group">
    <label>Your search engine</label>
    <select class="form-control" name="engine">
		  <option selected>Choose your search engine</option>
		  <option value="Google">Google</option>
		  <option value="Yahoo">Yahoo</option>
		  <option value="Bing">Bing</option>
    </select>
    </div>
    <div class="form-group">
    <label>Type a keyword</label>
    <input class="form-control" type="text" name="querybox" placeholder="Enter your keyword"/>
    </div>
    <div class="container-fluid text-center" >
    <button class="btn btn-outline-success">Search Keyword</button>
    </div>
    </form>
    
  </div>
</div>
  </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>