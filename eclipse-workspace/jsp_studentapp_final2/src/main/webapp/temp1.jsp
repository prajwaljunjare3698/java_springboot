<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String name = request.getParameter("name"); %>    
<% String email = request.getParameter("email"); %>    
<% String contact = request.getParameter("contact"); %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2{
		color: rgb(123,231,222);
	}

</style>
</head>
<body>
	
	<%if(name==null) { %>
		<form action="./temp1.jsp" method="post">
			Enter name:
			<input type="text" name="name"> <br>
			
			Enter email:
			<input type="text" name="email"> <br>
			
			Enter contact:
			<input type="text" name="contact"> <br>
			
			<input type="submit" name="submit" value="confirm">
			
		</form>
	<%} else{ %>
	
		<form action="./temp1.jsp" method="post">
		
			Enter name:
			<input type="text" name="name"> <br>
			
			Enter email:
			<input type="text" name="email"> <br>
			
			Enter contact:
			<input type="text" name="contact"> <br>
			
			<input type="submit" name="submit" value="confirm">
			
		</form>
		
		<h2>Your entered values are....</h2>
		<%=name+" "+contact+" "+email %>
		
		
	<%} %>

</body>
</html>