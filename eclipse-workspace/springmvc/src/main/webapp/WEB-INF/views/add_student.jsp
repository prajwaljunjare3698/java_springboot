<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <jsp:include page="homepage.jsp"></jsp:include>

<%StudentPojo student = (StudentPojo) request.getAttribute("student");%>
<%String msg = (String) request.getAttribute("msg");%>
<%String verify = (String) request.getAttribute("verify"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>

<style>
	 #main{
		background-color: #007d80bd;
		width: 429px;
		margin: 0 auto;
		margin-top: 30px;
		font-family:sans-serif;
		font-size: 20px;
		border: 1px solid;
		text-transform:capitalize;
		border-radius:10%;
	}
	
	table{
		margin:auto;
	}
	table td{ 
		padding:5px;
	}
	#course{
		border-radius: 8px;
	    padding: 5px;
		width:100%
	}
	h2,#submit{
		text-shadow:black 2px 2px 2px;
		text-align:center;
		color:white;
	}
	input{
		padding:5px;
		border-radius:8px;
	}
	option{
	font-size:16px;
		background:#c6f7c0;
	}
	#submit input{
		font-size:20px;
		padding:10px;
		background: lightgrey;
		border-radius:10px;
		color:firebrick;
	}
	h3{
		margin-left: 80px;
		font-size: 16px;
		color: red;
		
	}	
</style>


</head>
<body>
	
	<div id="main">
	<h2>Enter Student Details</h2>
	<form action="./add" method="post">
	
		<table>
			<tr>
				<td><label>Enter student name</label></td>
				<td><input type="text" name="name" required="required">
			</tr>
			
			<tr>
				<td><label>Enter student email</label></td>
				<td><input type="email" name="email" required="required">
			</tr>
			
			<tr>
				<td><label>Enter student contact</label></td>
				<td><input type="text" name="contact" required="required">
			</tr>
			
			<tr>
				<td><label>Enter student city</label></td>
				<td><input type="text" name="city"> <br></td>
			</tr>
			<tr>
				<td><label>Enter student username</label></td>
				<td><input type="text" name="username"> <br></td>
			</tr>
			<tr>
				<td><label>Enter student password</label></td>
				<td><input type="password" name="password"> <br></td>
			</tr>			
			
			<tr >
				<td colspan="2" id="submit"> <input type="submit" value="Confirm"></td>
			</tr>
		</table>
	
	</form>
	</div>
	<%if(student != null){ %>
	
		<h3><%=student.getName()+" " %>added successfully...</h3>
		
	<%}else if(msg != null) {%>
		<%=msg %>
	<%} %>
	
</body>
</html>