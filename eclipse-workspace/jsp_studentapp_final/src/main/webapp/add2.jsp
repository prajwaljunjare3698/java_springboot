<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
  
<%
	String active_user = (String)session.getAttribute("active_user");      
	session.setAttribute("active_user",active_user ); 
%>    
  
<%! 
	 Connection connection; 
	 String driver = "com.mysql.cj.jdbc.Driver"; 
	 PreparedStatement preparedStatement; 
	 String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	 String query; 
%>

<%
	String name = request.getParameter("name"); 

	String email = request.getParameter("email"); 
	String contact = request.getParameter("contact"); 
	String course = request.getParameter("course"); 
	String gender = request.getParameter("gender"); 
	String place = request.getParameter("place"); 
%>

<% 
	String[] arr = name.split(" ");
	String first = String.valueOf(arr[0].charAt(0)).toUpperCase()+arr[0].substring(1,arr[0].length()).toLowerCase();
	String last = String.valueOf(arr[1].charAt(0)).toUpperCase()+arr[1].substring(1,arr[1].length()).toLowerCase();

	String result = first +" "+ last;
	
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
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
	h{
		font-size: 18px;
		color: red;
		margin-left: 120px;
	}
</style>

<script>
	var cont=document.getElementById("click");
	windows.write("hey prajwal");
</script>
</head>
<body>
	<%if(active_user!=null){ %>
	

	
	<jsp:include page="homepage.jsp"/>

	
	
	<% try { %>	
			
			<% 
				Class.forName(driver); 
				connection = DriverManager.getConnection(db_url,"root","tiger");  
				query = "insert into studentdetail(name,email,contact,course,gender,place) values(?,?,?,?,?,?)"; 
				preparedStatement = connection.prepareStatement(query); 
				
				preparedStatement.setString(1, result); 
				preparedStatement.setString(2, email);
				preparedStatement.setString(3, contact);
				preparedStatement.setString(4, course); 
				preparedStatement.setString(5, gender); 
				preparedStatement.setString(6, place); 
				
				preparedStatement.executeUpdate(); 
			%>
				
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	
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
	<h3><%=result+" " %> record saved in database...</h3>
	
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>
</body>
</html>