<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div align="center">
		<h3>Register Student</h3><br>
		
		<c:choose>
			<c:when test="${param.code eq '200'}">
				<h3 style="background-color: green;">Student Register Successfully</h3>
			</c:when>
			<c:when test="${param.code eq '500'}">
				<h3 style="background-color: red;">Student Register Failed, Try again</h3>
			</c:when>
			<c:when test="${param.code eq '400'}">
				<h3 style="background-color: green;">Student Details Edited Successfully</h3>
			</c:when>
			<c:when test="${param.code eq '300'}">
				<h3 style="background-color: red;">Student Details Editing Failed, Try again</h3>
			</c:when>
			<c:when test="${param.code eq '110'}">
				<h3 style="background-color: green;">Student Details Deleted Successfully</h3>
			</c:when>
			<c:when test="${param.code eq '120'}">
				<h3 style="background-color: red;">Student Details Deleting Failed, Try again</h3>
			</c:when>
		</c:choose>
		<br><br>
		<form action="SaveStudent.jsp">
			Enter ID : <input type="text" name="id"><br><br>
			Enter Name : <input type="text" name="name"><br><br>
			Enter City : <input type="text" name="city"><br><br>
			Enter Contact : <input type="text" name="contact"><br><br>
			<button type="submit" class="btn btn-success">Save</button>
		</form>
	</div>
	
	<hr>
	
	<div align="center">
		<table class="table table-dark table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Contact</th>
					<th>City</th>
					<th>Edit / Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:setDataSource var="con"
					driver="com.mysql.cj.jdbc.Driver"
					url="jdbc:mysql://localhost:3306/jdbc"
					user="root"
					password="7028"	
				/>
				
				<s:query dataSource="${con}" var="rs" sql="select * from student"></s:query>
				
					<c:forEach var="d" items="${rs.rows}">
					
						<tr>
							<td>${d.id}</td>
							<td>${d.name}</td>
							<td>${d.contact}</td>
							<td>${d.city}</td>
							<td><a href="EditDetails.jsp?id=${d.id}">Edit</a> / 
							<a href="DeleteDetails.jsp?id=${d.id}">Delete</a></td>
						</tr>
					
					</c:forEach>
					
			</tbody>
		</table>
	</div>
</body>
</html>