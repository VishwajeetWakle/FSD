<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PHBook | New Contact</title>
</head>
<body>
	<%@ include file="navmenu.jsp" %>
	
	
	<div align="center">
	 	
	 		<c:choose>
	 			<c:when test="${requestScope.code eq '110'}">
	 				<div class="alert alert-success">
	 					Contact created Successfully.
	 				</div>
	 			</c:when>
	 			<c:when test="${requestScope.code eq '120'}">
	 				<div class="alert alert-danger">
	 					Error. Try Again....
	 				</div>
	 			</c:when>
	 		</c:choose>
	 		</div><br><br>
	
	<div align="center">
		<h3>Add New Contact</h3>
		<form action="create-contact">
			Enter Name : <input type="text" name="name"><br><br>
			Enter Contact : <input type="text" name="contact"><br><br>
			Enter DOB : <input type="date" name="dob"><br><br>
			<button type="submit" class="btn btn-success">Save</button>
		</form>
	</div>
</body>
</html>