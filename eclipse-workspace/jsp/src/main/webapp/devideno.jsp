<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page errorPage="error.jsp" %>  

    
<% String n1 = request.getParameter("n1"); %>
<% String n2 = request.getParameter("n2"); %>
<%!int c =0; %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception</title>
</head>
<body>

	<%if(n1==null && n2==null){ %>
		<form action="./devideno.jsp"method="post">
			<input type="number" name="n1" >
			<input type="number" name="n2" >
			<input type="submit" value="submit">
		</form>
	<%} else{%>
		<% int a = Integer.parseInt(n1); %>
		<% int b = Integer.parseInt(n2); %>
		
		<%try{ %>
		
			<%c = a/b; %>
			<h2>the division is<%=" "+c %></h2>
		
		<%}catch(Exception e){ %>
			<%=e %>
		<%} %>
		
		<h2>plz enter the second no is in range from 1 to max no</h2>
		
	<%} %>

</body>
</html>