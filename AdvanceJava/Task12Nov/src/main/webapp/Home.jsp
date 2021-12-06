<%@page import="java.util.Scanner"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div align="center">
	
	<a href="#">Home</a> |
	<a href="UpdateDetails.jsp">Update Details</a> |
	<a href="UpdatePass.jsp">Change Password</a> |
	<a href="Login.jsp?code=121">Logout</a>
	
	</div>
	<hr>
	<div align="right">
	<h4>Name : <%= session.getAttribute("name") %></h4>
	
	
	</div>
</body>
</html>