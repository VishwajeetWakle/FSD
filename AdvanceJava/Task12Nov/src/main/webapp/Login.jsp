<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h3>User Login</h3>
		<%
			String code = request.getParameter("code");
			if(code!=null){
				switch(code){
					case "401":
						%>
							<h4 style="color:red">Invalid User Name or Password</h4>
						<%
					break;
					case "124":
						%>
						<h4 style="color:green">Registration Success</h4>
					<%
				break;
					
					case "121":
						%>
							<h4 style="color:green">Logout Success....</h4>
						<%
					break;
					case "122":
						%>
							<h4 style="color:green">Password Change Success....</h4>
						<%
					break;
					case "125":
						%>
							<h4 style="color:green">Details Updated Success....</h4>
						<%
					break;
				}
			}
			
		%>
		
	<form action="Authintication">
		User Name : <input type="text" name="uname"><br><br>
		Password : <input type="password" name ="upass"><br><br>
		<button type="submit">Login</button>
		<a href="ForgotPass.jsp">Forgot Password?</a><br><br>
		<a href="Register.jsp">Not Yet Register</a>
	</form>
	</div>
</body>
</html>