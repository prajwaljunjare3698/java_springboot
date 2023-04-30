<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label for="name">Enter name:</label>
	<input type="text" name="name" id="name"> <br>
	<label for="pass">Enter password:</label>
	<input type="password" name="pass" id="pass">
	<button>show user</button>
	
	<%
	String n = "prajwal";
	out.print("hi");
	%>
	
	<h2>the name is <%=n %></h2>
	
</body>
</html>