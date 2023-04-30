<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
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
	 ResultSet resultSet; 
	 String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	 String query; 
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
	
	
</style>
</head>
<body>

	<%if(active_user!=null){ %>
	
	
	<jsp:include page="homepage.jsp"></jsp:include>
	
	<br><br>
	
	<% try { %>	
			
			<% 
				 Class.forName(driver); 
				 connection = DriverManager.getConnection(db_url,"root","tiger");  
				 query = "select * from studentdetail"; 
				 preparedStatement = connection.prepareStatement(query); 
				 resultSet = preparedStatement.executeQuery(); 
			 %>
						
			<table>
				<thead>
					<tr>
						<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>Course</b></td><td><b>Gender</b></td><td><b>Place</b></td><td><b>Edit</b></td>
					</tr>
				</thead>
			
			<%while(resultSet.next()) {%>					
					
				<tbody>
					<tr>
					<td><%=resultSet.getInt(1)%></td>
					<td><%=resultSet.getString(2)%></td>
					<td><%=resultSet.getString(3)%></td>
					<td><%=resultSet.getString(4)%></td>
					<td><%=resultSet.getString(5)%></td>
					<td><%=resultSet.getString(6)%></td>
					<td><%=resultSet.getString(7)%></td>		
							
					<form action="./update2.jsp" method="post">													
						<td><input type="submit" value="edit" ></td> 	
						<input type="hidden" name="id" value="<%=resultSet.getInt(1)%>" >
					</form>
									
				</tr>
				</tbody>	
			<%} %>					
			</table>	
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>

</body>
</html>