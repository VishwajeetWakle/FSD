<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PHBook | Search</title>
</head>
<body>
<%@ include file="navmenu.jsp" %>
	<div align="center">
		<h1>Search Contact From PHBook</h1><br><br>
		<form action="search-contact">
			Search By Name : <input type="text" name="name">
			<button type="submit">Search</button><br><br>
		</form>
		<form action="search-contact">
			Search By Contact : <input type="text" name="contact">
			<button type="submit">Search</button><br><br>
		</form>
		<form action="search-contact">
			Search By DOB : <input type="date" name="dob">
			<button type="submit">Search</button><br><br>
		</form>
		<br><br>	
		<h3 align="center">Result</h3>
		<br><br>
	
	
	<table  class="table table-dark table-hover">
		<thead>
			<tr>
				<th>Name</th>
				<th>Contact</th>
				<th>DOB(yyyy-mm-dd)</th>
				<th>Edit / Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="contact" items="${requestScope.contactList}">
			<tr>
				<td>${contact.name}</td>
				<td>${contact.contact}</td>
				<td>${contact.dob}</td>
				<td>
					<a href="edit-contact?id=${contact.id}">Edit</a> /
					<a href="delete-contact?id=${contact.id}">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>