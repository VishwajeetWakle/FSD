<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body>
	<div align="center">
	
	<a href="Home.jsp">Home</a> |
	<a href="UpdateDetails.jsp">Update Details</a> |
	<a href="UpdatePass.jsp">Change Password</a> |
	<a href="Login.jsp?code=121">Logout</a>
	
	</div>
	<hr>
	<div align="center">
		<h4>Update Details</h4>
		<form action="UpdateDetails">
		User Name : <input type="text" name="uname"><br><br>
		Email : <input type="email" name="email"><br><br>
		Contact : <input type="text" name="contact"><br><br>
		Enter Current Password : <input type="password" name="upass">
		<button type="submit">Update</button>
		</form>
	</div>
</body>
</html>