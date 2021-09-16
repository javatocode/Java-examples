<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.ingle.web.conn.JdbcConn"%>
<%@page import="com.ingle.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <title>Student JDBC | Servlet | JSP </title>
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
    <h4>Student Management : </h4>
    <div class="card">
      <div class="card-header">
        <ul class="nav nav-tabs nav-pills" role="tablist">
	<li class="nav-item">
		<a class="nav-link active" data-toggle="tab" href="#tabs-1" role="tab">Show Data</a>
	</li>
	<li class="nav-item">
		<a class="nav-link" data-toggle="tab" href="#tabs-2" role="tab">Save Data</a>
	</li>
	<li class="nav-item">
		<a class="nav-link" data-toggle="tab" href="#tabs-3" role="tab">Update Data</a>
	</li>
	<li class="nav-item">
		<a class="nav-link" data-toggle="tab" href="#tabs-4" role="tab">Delete Data</a>
	</li>
	<li class="nav-item">
		<a class="nav-link" data-toggle="tab" href="#tabs-5" role="tab">Table Data</a>
	</li>
</ul><!-- Tab panes -->
      </div>
      <div class="card-body" >
      <div class="tab-content">
      <div class="tab-pane active" id="tabs-1" role="tabpanel">
		<div class="registration-form">
		<form action="fetch">
		<h4>Get Student Information</h4>
		<div class="form-group">
		
		<input type="text" name="sid" class="form-control item" placeholder="Enter Id of Student">
		</div>
		<input type="submit" class="btn btn-block create-account" value="Get Data">
		</form>
         </div>

          
	</div>
	<div class="tab-pane" id="tabs-2" role="tabpanel">
		<div class="registration-form">
		<form action="post_data" method="post">
		<h4>Student Registration Form</h4>
		<div class="form-group">
		<input type="text" name="stuname" class="form-control item" placeholder="Enter Name of Student ">
		</div>
		<div class="form-group">
		<input type="text" name="stuphone" class="form-control item" placeholder="Enter Phone No of Student ">
		</div>
		<div class="form-group">
		<input type="text" name="stucity" class="form-control item" placeholder="Enter City of Student ">
		</div>
		<input type="submit" class="btn btn-block create-account" value="Post Data">
		</form>
         </div>
	</div>
	<div class="tab-pane" id="tabs-3" role="tabpanel">
		<div class="registration-form">
		<form action="update_data" method="post">
		<h4>Student Update Form</h4>
		<div class="form-group">
		<input type="text" name="stuid" class="form-control item" placeholder="Enter Id of Student">
		</div>
		<div class="form-group">
		<input type="text" name="stuname" class="form-control item" placeholder="Enter Name of Student ">
		</div>
		<div class="form-group">
		<input type="text" name="stuphone" class="form-control item" placeholder="Enter Phone No of Student ">
		</div>
		<div class="form-group">
		<input type="text" name="stucity" class="form-control item" placeholder="Enter City of Student ">
		</div>
		<input type="submit" class="btn btn-block create-account" value="Update Data">
		</form>
         </div>
	</div>
	
	<div class="tab-pane" id="tabs-4" role="tabpanel">
		<div class="registration-form">
		<form action="delete_data" method="post">
		<h4>Delete Student Data</h4>
		<div class="form-group">
		<input type="text" name="sid" class="form-control item" placeholder="Enter Id of Student">
		</div>
		<input type="submit" class="btn btn-block create-account" value="Delete Data">
		</form>
         </div>
	</div>
	
	
	  <div class="tab-pane" id="tabs-5" role="tabpanel">
	  <div class="registration-form">
  <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">City</th>
      <th scope="col">Phone</th>
    </tr>
  </thead>
  <% 
    Student s = new Student();
    try {
 			 Connection con = JdbcConn.createConn();
             String q = "select * from students";
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(q);
             while(rs.next()) {
             	int id = rs.getInt(1);
                 String name = rs.getString("sname");
                 String phone = rs.getString("sphone");
                 String city = rs.getString("scity");
                 
                 
   %>
  <tbody>
    <tr>
      <td >
      <%= id %>
      </td>
	   <td >
      <%= name %>
      </td>
       <td >
      <%= city %>
      </td>
      <td >
      <%= phone %>
      
      </td>
    </tr>

   <% 
         }
 		}catch(Exception e) {
 			System.out.println(e);
 		}
   %>
        
      </tbody>
</table>   
</div>  
</div>
	
	
	
      </div>
  
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
