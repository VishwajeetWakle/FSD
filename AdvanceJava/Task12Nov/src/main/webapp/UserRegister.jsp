<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	
	<%
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");

		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement stmt = con.prepareStatement("insert into task12nov values(?,?,?,?)");
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, contact);
				stmt.setString(4, pass);
				stmt.executeUpdate();
				con.close();
				response.sendRedirect("Login.jsp?code=124");
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>