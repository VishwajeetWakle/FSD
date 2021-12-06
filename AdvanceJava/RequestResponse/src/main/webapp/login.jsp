<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<div>
	<h2>User Login</h2>
	<form action="Auth" method="POST">
		Enter User Name : <input type="text" name="uname"><br><br>
		Enter Password : <input type="password" name="upass"><br><br>
		<button type="submit">Login</button>
		<button type="reset">Reset</button>
	</form>
</div>
</body>
</html>