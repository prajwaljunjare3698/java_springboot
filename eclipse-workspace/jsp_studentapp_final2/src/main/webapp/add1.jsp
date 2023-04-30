<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%String logout = request.getParameter("logout"); %>    
<% session.setAttribute("out",logout); %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
		border-radius:10% 0;
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
</style>

<script>
	var cont=document.getElementById("click");
	windows.write("hey prajwal");
</script>

</head>
<body>
	
	<%if(logout==null){ %>
	
	<h1><%=logout %></h1>

	<jsp:include page="homepage.jsp"/>
	
	<div id="main">
	<h2>Enter Student Details</h2>
	<form action="./add2.jsp" method="post">
	
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
				<td><input type="number" name="contact" required="required">
			</tr>
			
			
			<tr>
				<td><label for="course">Course:</label></td>
				<td>
					<select id="course" name="course">
						<option selected disabled>Select</option>
						<option>Java</option>
						<option>Python</option>
						<option>WetTech</option>
						<option>Selenium</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><label id="gender" for="gender">Gender:</label></td>
				<td>
					<input  type="radio" name="gender" id="male" value="male">
					<label for="male">Male</label>		
					<input type="radio" name="gender" id="female" value="female">
					<label for="female">Female</label>
				</td>
			</tr>
			<tr>
				<td><label>Enter student place</label></td>
				<td><input type="text" name="place"> <br></td>
			</tr>
			<tr >
				<td colspan="2" id="submit"> <input type="submit" value="Confirm"></td>
			</tr>
		</table>
	
	</form> 
	</div>
	<input id="click" type="submit" value="click me">

	<%}else{ %>
		<h3>sign in first</h3>
		<jsp:forward page="homepage_start.jsp"></jsp:forward>
	<%} %>

</body>
</html>