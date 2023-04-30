<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root" password="tiger"/>
	<sql:query var="q" dataSource="${db}">select * from qspider</sql:query>
	
	<table border="1px solid">
		<tr>
			<h3>
				<td>Sid</td> 
				<td>Name</td>	
				<td>Age</td>
				<td>Email</td>
				<td>Course</td>
			</h3>
		</tr>
	</table>
	
	<c:forEach items="${q.rows}" var="qspider">
	
	<table border="1px solid">
		<tr>
			<td><c:out value="${qspider.sid}"></c:out></td>
			 <td><c:out value="${qspider.name}"></c:out></td>
			 <td><c:out value="${qspider.age}"></c:out></td>
			 <td><c:out value="${qspider.email}"></c:out></td>
			 <td><c:out value="${qspider.course}"></c:out></td>
		</tr>			
	</table>
		
	</c:forEach>


</body>
</html>