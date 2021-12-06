<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div align="center">
	<h3>Registration</h3>
	<form action="UserRegister.jsp">
		User Name : <input type="text" name="uname"><br><br>
		Email : <input type="email" name="email"><br><br>
		Password : <input type="password" name ="upass"><br><br>
		Contact : <input type="text" name="contact"><br><br>
		<button type="submit">Register</button>
		
		<a href="Login.jsp">Already Register?</a>
	</form>
</div>
</body>
</html>