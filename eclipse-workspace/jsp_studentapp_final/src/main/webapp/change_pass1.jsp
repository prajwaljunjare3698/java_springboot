<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<%String active_user = (String)session.getAttribute("active_user");  %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form{
		margin-top: 10px;
    	margin-left: 279px;
	}
	label{
		height: 30px;
	    font-family: sans-serif;
	    margin-top: 76px;
	    margin-left: 5px;
	    font-size: 18px;
		
	}
	input{		 
	    height: 30px;
	    font-family: sans-serif;
	    margin-top: 76px;
	    margin-left: 5px;
	    outline: none;
	    border-radius: 14px;
	}
</style>
</head>
<body>

	<%if(active_user!=null){ %>
	
	
	<jsp:include page="homepage.jsp"></jsp:include>


	<form action="./change_pass2.jsp" method="post">
	
		<label>Enter new password</label>
		<input id="pass" type="password" name="password" pattern=".{6,6}"   required title="6 characters " placeholder="pass should contain 6 char" autofocus="autofocus" >
		<input type="submit" value="confirm">
	
	</form>
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>

</body>
</html>