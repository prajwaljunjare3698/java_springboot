<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%String active_user = (String)session.getAttribute("active_user");  %>    
<%session.setAttribute("active_user",active_user ); %>    
    
    
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
		margin-left: 6px;
		font-size: 20px;
	}	

</style>

</head>
<body>

	<%if(active_user!=null){ %>
	
		<jsp:include page="homepage.jsp"></jsp:include>	
		
		<br><br><br>
		<form action="./search2.jsp" method="post">	
		
			<label>Enter id</label>
			<input type="text" name="id" autofocus required="required">	
			<input type="submit" value="submit">	
			
		</form>
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>
</body>
</html>