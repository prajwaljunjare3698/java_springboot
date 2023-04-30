<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="homepage.jsp"></jsp:include>

<%
	List<StudentPojo> students = (List<StudentPojo>) request.getAttribute("students");
	String msg = (String) request.getAttribute("msg");
	StudentPojo student = (StudentPojo) request.getAttribute("student");
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h3{
		font-family: monospace;
		color: red;
	}
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 90;
	  margin-left: 70px;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 10px;
	}
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	thead {
		background-color: #5dc7a78f;
	}
	form {
		margin-left: 40px;
		margin-top: 7px;
}
	
</style>
</head>
<body>

	<%if (student != null) {%>
		<h2>Update Student Details</h2>
		<form action="./updateData" method="post">
			<table>
				<tr>
					<td>Id</td>
					<td>
					<input style="outline: none; font-size:16px; background-color:red; border: none;" type="text" name="id" readonly="readonly" value="<%= student.getId()%>">
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td>
					<input type="text" name="name" value="<%= student.getName()%>">
					</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>
					<input type="text" name="email" value="<%= student.getEmail()%>">
					</td>
				</tr>
				<tr>
					<td>Contact</td>
					<td>
					<input type="text" name="contact" value="<%= student.getContact()%>">
					</td>
				</tr>
				<tr>
					<td>City</td>
					<td>
					<input type="text" name="city" value="<%= student.getCity()%>">
					</td>
				</tr>
				<tr>
					<td>Username</td>
					<td>
					<input type="text" name="username" value="<%= student.getUsername()%>">
					</td>
				</tr>
				<tr>
					<td>Password</td>
					<td>
					<input type="text" name="password" value="<%= student.getPassword()%>">
					</td>
				</tr>
				<tr>
					<td>
					<input type="submit" value="Update">
					</td>
				</tr>
			</table>
		</form>
	
	<%} else {%>
	
	
		<h2>Select Student</h2>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Enter Student id :</td>
					<td><input type="text" name="id" required="required" autofocus="autofocus"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Select"></td>
				</tr>
			</table>
		</form>
	
	<%if (msg != null) { %>
		<h3 align="center"><%= msg%></h3>
	<%} %>
	
	<%if (students != null) {%>
	
		<h2>Student Details</h2>
		<table id="data">
			<thead>
				<tr>
					<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>City</b></td><td><b>UserName</b></td><td><b>Password</b></td>
				</tr>
			</thead>
			
			<%for (StudentPojo std : students) {%>
			<tr>
				<td><%=std.getId()%></td>
				<td><%=std.getName()%></td>
				<td><%=std.getEmail()%></td>
				<td><%=std.getContact()%></td>
				<td><%=std.getCity()%></td>
				<td><%=std.getUsername()%></td>
				<td><%=std.getPassword()%></td>
			</tr>
			<%}	%>
		</table>
	<%}	%>
	<%}	%>
	
</body>
</html>