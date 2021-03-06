<html>
<head>
<meta charset="ISO-8859-1">
<%@ page isELIgnored="false"%>
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-12" >
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${pd}" var="ps">
    <tr>
      <th scope="row">${ps.id}</th>
      <td>${ps.name}</td>
      <td>${ps.description}</td>
      <td>${ps.price}</td>
      <td>
      <a class="btn btn-warning" href="update/${ps.id}">Edit</a>
      <a class="btn btn-danger" href="deletepro/${ps.id}">Delete</a>
      </td>
      
      
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container-fluid text-center" >
    <a class="btn btn-success" href="add">Add product</a>
    </div>
</div>
</div>
</div>
</body>
</html>
