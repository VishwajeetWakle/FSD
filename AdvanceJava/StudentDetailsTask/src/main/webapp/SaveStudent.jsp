
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="s" %>

<s:setDataSource
	var="con"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/jdbc"
	user="root"
	password="7028"
/>

<s:update dataSource="${con}" var="count" sql="insert into student values(?,?,?,?)">
		<s:param value="${param.id}"></s:param>
		<s:param value="${param.name}"></s:param>
		<s:param value="${param.contact}"></s:param>
		<s:param value="${param.city}"></s:param>
</s:update>

<c:if test="${count>0}">
		<c:redirect url="StudentDetails.jsp?code=200"></c:redirect>
</c:if>

<c:if test="${count<=0}">
		<c:redirect url="StudentDetails.jsp?code=500"></c:redirect>
</c:if>