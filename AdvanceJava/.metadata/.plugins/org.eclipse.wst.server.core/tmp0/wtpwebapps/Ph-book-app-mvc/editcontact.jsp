<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PHBook | Edit Contact</title>
</head>
<body>
	
	 <%@ include file="navmenu.jsp" %>
	 
	 <div align="center">
	 	
	 		<c:choose>
	 			<c:when test="${requestScope.code eq '200'}">
	 				<div class="alert alert-success">
	 					Contact Details Updated Successfully.
	 				</div>
	 			</c:when>
	 			<c:when test="${requestScope.code eq '500'}">
	 				<div class="alert alert-danger">
	 					Error while updating contact details. Try Again....
	 				</div>
	 			</c:when>
	 		</c:choose>
	 			
	 		<form action="update-contact-details">
	 		<input type="hidden" name="id" value="${requestScope.contact.id}"><br><br>
	 		Name : <input type="text" name="name" value="${requestScope.contact.name}"><br><br>		
	 		Contact : <input type="text" name="contact" value="${requestScope.contact.contact}"><br><br>
	 		DOB : <input type="text" name="dob" value="${requestScope.contact.dob}"><br><br>
	 		<button type="submit">Update</button>
	 		</form>
	 </div>
</body>
</html>