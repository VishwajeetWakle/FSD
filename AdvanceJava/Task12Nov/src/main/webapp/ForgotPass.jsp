<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
	<div align="center">
		<h3>Forgot Password</h3>
		<hr><%
		String code = request.getParameter("code");
			if(code!=null){
				switch(code){
					case "123":
						%>
							<h4 style="color:red">Invalid Details</h4>
						<%
					break;
				}
			}
			 %>
		<form action="ForgotPassAuth">
			Enter User Name : <input type="text" name="uname"><br><br>
			Enter Email : <input type="text" name="email"><br><br>
			Enter New Password : <input type="password" name="upass"><br><br>
			<button type="submit">Submit</button>
			<a href="Logi.jsp">Login Page</a>
		</form>
	</div>
</body>
</html>