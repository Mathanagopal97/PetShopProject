<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebApp</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf=8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" >
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav id ="navbar-red" class="navbar navbar-inverse navbar-static-top" role="navigation">
<div class="container">
<ul class="nav navbar-nav">
<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-nav">
<span class="icon bar"></span>
<span class="icon bar"></span>
<span class="icon bar"></span>
<span class="icon bar"></span>
</button>
</ul>
</div>
    <div class="navbar-header">
      <a class="navbar-brand" href="#">PETS</a>
    </div>
<div class="collapse navbar-collapse" id="bs-example-nav">
	
<ul class="nav navbar-nav">
	
   <li><a href="index.jsp">Home</a></li>
     <li><a href="adding"><i class="fa fa-plus-square" aria-hidden="true"></i>Admin</a></li>
     <li><a href="category"><span class="glyphicon glyphicon-list-alt"></span>Category</a></li>
      <li><a href="product"><span class="glyphicon glyphicon-list-alt"></span>Product</a></li>
      <li><a href="supplier"><span class="glyphicon glyphicon-list-alt"></span>Supplier</a></li>
       
</ul> 
    <ul class="nav navbar-nav navbar-right">
     <li><a href="#"><span class="glyphicon glyphicon-user"></span>Welcome admin!!!</a></li>
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-in"></span> SignOut</a></li>
    </ul>




</div>

</nav>

</body>
</html>