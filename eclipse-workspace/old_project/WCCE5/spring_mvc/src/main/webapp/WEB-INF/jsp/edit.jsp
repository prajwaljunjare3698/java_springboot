<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/update">
	ID: <input type="text" name="empId" value="${emp.empId}"><br>
		NAME: <input type="text" name="empName" value="${emp.empName}"><br>
		CITYNAME: <input type="text" name="cityName" value="${emp.cityName}"><br>
		USERNAME: <input type="text" name="userName" value="${emp.userName}"><br>
		PASSWORD: <input type="text" name="password" value="${emp.password}"><br>
		<input type="submit" value="UPDATE">
	</form>
</body>
</html>