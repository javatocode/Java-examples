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
    <title>Register</title>
  </head>
  <body style="background: url('<c:url value='/vendor/img/back-search.jpeg' />'); background-size: cover; background-repeat: no-repeat;">

 <div class="container">
  <div class="card mx-auto mt-5" style="width: 400px; background-color:#ffffb3;">
  <div class="container-fluid text-right mt-3">
  <h4 class="text-center text-black"><b>Registration Form</b></h4>
<!--   <a href="reg"><button class="btn btn-primary"  style="width:90px">Logout</button></a> -->
  </div>
  <div class="card-body py-5" >
    <form action="uplaodform" class="mt-3" method="post"  enctype="multipart/form-data">
    <div class="form-group">
    <label>Name</label>
    <input class="form-control" type="text" name="name" placeholder="Enter your name"/>
    </div>
    <div class="form-group">
    <label>Email</label>
    <input class="form-control" type="email" name="email" placeholder="Enter your email"/>
    </div>
    <div class="form-group">
    <label>Date of Birth</label>
    <input class="form-control" type="date" name="date" placeholder="Enter your date of birth"/>
    </div>
    <div class="form-group">
    <label>City</label>
    <input class="form-control" type="text" name="city" placeholder="Enter your city"/>
    </div>
    <div class="form-group">
    <label>State</label>
    <input class="form-control" type="text" name="state" placeholder="Enter your state"/>
    </div>
    <div class="form-group">
    <label>Password</label>
    <input class="form-control" type="password" name="pass1" placeholder="Enter your password"/>
    </div>
    <div class="form-group">
    <label>Confirm Password</label>
    <input class="form-control" type="password" name="pass2" placeholder="Enter your confirm password"/>
    </div>
     <div class="form-group">
     <label>Choose Your Gender</label>
    <select class="form-control" name="gender">
		  <option selected>Choose gender</option>
		  <option value="Male">Male</option>
		  <option value="Female">female</option>
    </select>
    </div>
     <div class="form-group">
    <select multiple class="form-control" name="fengine">
		  <option selected>Choose favourite Search Engine</option>
		  <option value="Google">Google</option>
		  <option value="Yahoo">Yahoo</option>
		  <option value="Bing">Bing</option>
		  <option value="Duckduckgo">Duckduckgo</option>
    </select>
    </div>
    <div class="form-group">
    <label>Upload Your profile</label>
    <input class="form-control" type="file" name="profile" />
    </div>
    <div class="container-fluid text-center" >
    <button  class="btn btn-primary">Register</button>
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