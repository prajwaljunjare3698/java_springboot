<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%String logout = request.getParameter("logout"); %> 

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		/* background-image: linear-gradient(100deg, rgb(214, 198, 198), rgb(157, 241, 123)); */
		background-image: linear-gradient(100deg, rgb(191, 228, 225), rgb(255, 255, 255));
	}
	nav{
		margin-top: 30px;
	}
	a{
		text-decoration: none;
		font-size: 20px;
		margin-left: 10px;
		margin-top: 20px;
		color: #f6f923;
		padding: 17px 42px 18px 41px;
		background-color: #4ea3c1db;
		border-radius: 16px;
	}
</style>
</head>
<body>

		<%=logout %>

	<%if(logout==null){ %>
		
	<nav>	
		<a href="./homepage.jsp">Home</a>
		<a href="./search1.jsp">Search</a>
		<a href="./add1.jsp">Add</a>
		<a href="./update1.jsp">Update</a>
		<a href="./remove1.jsp">Remove</a>
		<a href="./logout.jsp">Logout</a>		
	</nav>
	<%}else{ %>
		<h3>sign in first</h3>
		<jsp:forward page="homepage_start.jsp"></jsp:forward>
	<%} %>

</body>
</html>