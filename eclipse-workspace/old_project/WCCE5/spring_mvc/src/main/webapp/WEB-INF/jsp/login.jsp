<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>   
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<form action="${pageContext.request.contextPath}/login">
			USERNAME: <input type="text" name="userName"><br>
			PASSWORD: <input type="text" name="password"><br>
			<input type="submit" value="LOGIN"> <br>
			<a href="${pageContext.request.contextPath}/registerPage">Click Here For Register</a>
		</form>
</body>
</html>