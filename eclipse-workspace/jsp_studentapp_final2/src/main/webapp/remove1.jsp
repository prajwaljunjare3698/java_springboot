<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<% Object logout = session.getAttribute("out"); %>    
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%! Connection connection; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement; %>
<%! ResultSet resultSet; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<%! String query; %>    
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
</style>
</head>
<body>

	<%if(logout==null){ %>
	<h1><%=logout %></h1>
	
	<jsp:include page="homepage.jsp"></jsp:include>
	<br><br>
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "select * from studentdetail"; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
			
			<table>
				<thead>
					<tr>
						<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>Course</b></td><td><b>Gender</b></td><td><b>Place</b></td><td><b>Remove</b></td>
					</tr>
				</thead>			
			
			<%while(resultSet.next()) {%>					
				
				<tbody>
				<tr>
					<td><%=resultSet.getString(1)%></td>
					<td><%=resultSet.getString(2)%></td>
					<td><%=resultSet.getString(3)%></td>
					<td><%=resultSet.getString(4)%></td>
					<td><%=resultSet.getString(5)%></td>
					<td><%=resultSet.getString(6)%></td>
					<td><%=resultSet.getString(7)%></td>
					
					<form action="./remove2.jsp" method="post">		
						<input type="hidden" name="user" value="<%=resultSet.getInt(1)%>" >									
					<td><input type="submit" value="delete" ></td>	
					</form>					
				</tr>
				</tbody>	
			
			<%} %>	
			</table>				
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	
	<%}else{ %>
		<h3>sign in first</h3>
		<jsp:forward page="homepage_start.jsp"></jsp:forward>
	<%} %>

</body>
</html>