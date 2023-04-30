<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="homepage.jsp"></jsp:include>
<%
	List<StudentPojo> students = (List<StudentPojo>) request.getAttribute("students");
	String msg = (String) request.getAttribute("msg");
%>
  
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
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 8px;
	}
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	thead {
		background-color: #5dc7a78f;
	}
	form {
		margin-left: 40px;
		margin-top: 80px;
}
</style>
</head>
<body>

	<form action="./remove" method="post">
		<label>Enter id</label>
		<input type="text" name="id" autofocus required="required">	
		<input type="submit" value="remove">	
	</form>
	
	<%if (msg != null) {%>
		<h3 align="center"><%=msg%></h3>
	<%}	%>
	
	<%if (students != null) {%>
		<h2>Student Details</h2>
		<table id="data">
			<thead>
				<tr>
					<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>City</b></td><td><b>UserName</b></td><td><b>Password</b></td>
				</tr>
			</thead>					
					
			<tbody>
				<%for (StudentPojo student : students) {%>
				<tr>
					<td><%=student.getId()%></td>
					<td><%=student.getName()%></td>
					<td><%=student.getEmail()%></td>
					<td><%=student.getContact()%></td>
					<td><%=student.getCity()%></td>
					<td><%=student.getUsername()%></td>
					<td><%=student.getPassword()%></td>
				</tr>
				<%}	%>
			</tbody>
			
		</table>
	<%}%>
	
</body>
</html>