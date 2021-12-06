<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PHBook | View Contact</title>
</head>
<body>
	<%@ include file="navmenu.jsp" %>
	<div align="center">
	 	 		<c:choose>
	 			<c:when test="${requestScope.code eq '150'}">
	 				<div class="alert alert-success">
	 					Contact Deleted Successfully.
	 				</div>
	 			</c:when>
	 			<c:when test="${requestScope.code eq '160'}">
	 				<div class="alert alert-danger">
	 					Error. Try Again....
	 				</div>
	 			</c:when>
	 		</c:choose>
	 		</div><br><br>
	
	<br>
	
	<h3 align="center">List of All Contacts</h3>
	<br>
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
</body>
</html>