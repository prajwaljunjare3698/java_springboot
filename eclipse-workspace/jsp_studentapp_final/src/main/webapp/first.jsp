<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%String name = request.getParameter("name"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%if(name==null){ %>	
	
		<% Date date = new Date();%>
		
		<%= date.toString() %>
	
		<form action="./first.jsp">
			<label>Enter name:</label>
			<input type="text" name="name">
			<input type="submit" name="submit">
		</form>
		
	<%}else{ %>		
		
	<%} %>


</body>
</html>