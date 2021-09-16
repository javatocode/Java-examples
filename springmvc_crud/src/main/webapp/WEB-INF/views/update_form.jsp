<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3" >
 <div class="card-body py-5 bg-danger" >
     
    <form action="${pageContext.request.contextPath}/addpro" class="mt-3" method="post" >
    <input class="form-control" type="hidden" name="id" value="${pd.id}"/>
     <div class="form-group">
    <label class="text-white">Product Name</label>
    <input class="form-control" type="text" name="name" placeholder="Enter your product name" value="${pd.name}"/>
    </div>
    <div class="form-group">
    <label class="text-white">Product Description</label>
    <input class="form-control" type="text" name="description" placeholder="Enter your product description"  value="${pd.description}"/>
    </div>
    <div class="form-group">
    <label class="text-white">Product Price</label>
    <input class="form-control" type="text" name="price" placeholder="Enter your product description"  value="${pd.price}"/>
    </div>
    <div class="container-fluid text-center" >
    <a class="btn btn-warning" href="${pageContext.request.contextPath}/">Back</a>
    <button class="btn btn-success">Update product</button>
    </div>
    </form>
    </div>
  </div>
  </div>
  </div>
</body>
</html>