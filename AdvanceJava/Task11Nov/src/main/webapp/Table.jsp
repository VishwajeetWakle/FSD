<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>
	<%
	String g = request.getParameter("Num");
	int num = Integer.parseInt(g);
		
	%>
	<h1>The table of :<%= g %></h1>
	<% for(int i =1; i<=10; i++){
		
		int m = i*num;
		%>
		<h3><%= m %></h3>
		<%
	} %>
	<a href="Number.jsp">Get Another</a>
</body>
</html>