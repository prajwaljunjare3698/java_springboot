<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%String logout = request.getParameter("out"); %> --%>
<% Object logout = session.getAttribute("out"); %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#main{
		margin-left: 50px;
		margin-top: 50px;
		height: 180px;
		width:820px;
		background-color: #009affba;;
		font-size: 18px;
	}
	form {
		margin-left: 190px;
		font-size: 20px;
	}	


</style>

</head>
<body>

	<% if(logout==null){ %>
	
	<jsp:include page="homepage.jsp"></jsp:include>	
	<br><br><br>
	<form action="./search2.jsp" method="post">	
	
		<label>Enter id</label>
		<input type="text" name="id" autofocus required="required">	
		<input type="submit" value="submit">	
		
	</form>
	
	<%}else{ %>
		<h3>sign in first</h3>
		<jsp:forward page="homepage_start.jsp"></jsp:forward>
	<%} %>
		
</body>
</html>