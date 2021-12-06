<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Details</title>
</head>
<body>
 <s:setDataSource var="con"
					driver="com.mysql.cj.jdbc.Driver"
					url="jdbc:mysql://localhost:3306/jdbc"
					user="root"
					password="7028"	
				/>
				
				<s:query dataSource="${con}" var="rs" sql="select * from student"></s:query>
				
				
				
	
	<div align="center">
		<h3>Edit Student Details</h3>
		<c:forEach var="d" items="${rs.rows}">
		<c:if test="${d.id eq param.id }">
		<form action="SaveEdit.jsp?id=${param.id}">
			<input type="hidden" name="id" value="${d.id}">
			Enter Name : <input type="text" name="name" value="${d.name }"><br><br>
			Enter City : <input type="text" name="city" value="${d.city}"><br><br>
			Enter Contact : <input type="text" name="contact" value="${d.contact}"><br><br>
			<button type="submit" class="btn btn-success">Save Change</button>
		</form>
		</c:if>
		</c:forEach>
	</div>
	</body>
</html>