<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="homepage.jsp"></jsp:include>	  

<%StudentPojo student = (StudentPojo)request.getAttribute("student"); %>    
<%String msg = (String) request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>	
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 90;
	  margin-left: 80px;
	}
	
	td, th {
	  border: 1px solid #afb995;
	  text-align: left;
	  padding: 8px;
	}
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	thead {
		background-color: #5dc7a78f;
		padding: 10px 10px 10px 10px;
	}
	h3{
		align-content: center;
	}
	h2{
		color: #205221;
		margin-left: 30px;
	}

</style>

</head>
<body>

	
	
	<br><br><br>
	
	<form action="./search" method="post">
		<label>Enter id</label>
		<input type="text" name="id" autofocus required="required">	
		<input type="submit" value="submit">	
	</form>

	<%if (student != null) {%>

		<h3>Student Data</h3>
		<table>
			<thead>
				<tr><td><h3>ID</h3></td><td><h3>Name</h3></td><td><h3>Email</h3></td><td><h3>Contact</h3></td><td><h3>City</h3></td><td><h3>Username</h3></td><td><h3>Password</h3></td>
				</tr>  
			</thead>
			<tbody>
				<tr>
					<td><%=student.getId()%></td>
					<td><%=student.getName()%></td>
					<td><%=student.getEmail()%></td>
					<td><%=student.getContact()%></td>
					<td><%=student.getCity()%></td>
					<td><%=student.getUsername()%></td>
					<td><%=student.getPassword()%></td>
				</tr>
			</tbody>
		</table>
	<%}	%>
	<%if (msg != null) {%>
		<h3>
			<%=msg%>
		</h3>
	<%}	%>
	
</body>
</html>