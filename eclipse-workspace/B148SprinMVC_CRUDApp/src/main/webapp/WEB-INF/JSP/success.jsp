<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<table border="1" style="align-items: center;">

		<tbody  style="align-items: center;">
			<th>EMPID</th>
			<th>Name</th>
			<th>City</th>
			<th>UName</th>
			<th>Password</th>
			<c:forEach items="${empList}" var="emp" >
				<tr  style="align-items: center;">
					<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.cityName}</td>
							<td>${emp.userName}</td>
								<td>${emp.password}</td>
								<td><a href="${pageContext.request.contextPath}/delete/${emp.empId}">DELETE</a></td>
								<td><a href="${pageContext.request.contextPath}/edit/${emp.empId}">EDIT</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</center>
</body>
</html>