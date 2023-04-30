<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String name = request.getParameter("name"); %>
<% String username = request.getParameter("username"); %>
<% String password = request.getParameter("password"); %>
<% String email = request.getParameter("email"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		
		<label>Name:</label>
		<%= name %> <br>
		
		
		<label > UserName:</label>
		<%= username %> <br>
		
		<label > Password:</label>
		<%= password %> <br>
		
		<label > Email:</label>
		<%= email %> <br>
		
							



</body>
</html>