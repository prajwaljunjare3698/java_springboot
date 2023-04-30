<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<% String id = request.getParameter("id"); %>

<%! Connection connection; %>
<%! ResultSet resultSet; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>

<%! PreparedStatement preparedStatement; %>
<%! String query; %>    
        
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h3{
		margin-left: 190px;
	}
	#main{
		margin-left: 50px;
		margin-top: 50px;
		height: 180px;
		width:820px;
		background-color: #009affba;;
		font-size: 18px;
	}
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 90;
	  margin-left: 80px;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 10px 28px 11px 14px;
	}
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	thead {
		background-color: #5dc7a78f;
	}
	
	form {
		margin-left: 190px;
		font-size: 20px;
	}	

</style>
</head>
<body>
	
	<jsp:include page="homepage.jsp"></jsp:include>	
		<br><br>
		<% try { %>	
		
			<form action="./search2.jsp" method="post">	
			
				<label>Enter id</label>
				<input type="text" name="id" autofocus required="required">		
				<input type="submit" name="confirm">	
				
			</form>
			<br>
			
			<% Class.forName(driver); %>
			<% int std_id = Integer.parseInt(id); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "select * from studentdetail where id="+std_id+""; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
			
			<% boolean flag = false; %>
			
			<table>
				<thead>
					<tr>
						<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>Course</b></td><td><b>Gender</b></td><td><b>Place</b></td><td><b>Edit</b></td>
					</tr>
				</thead>
			
			<%while(resultSet.next()) {%>	
			
				<% flag = true; %>
				
				<tbody>
					<tr>
						<td><%=resultSet.getInt(1)%></td>
						<td><%=resultSet.getString(2)%></td>
						<td><%=resultSet.getString(3)%></td>
						<td><%=resultSet.getString(4)%></td>
						<td><%=resultSet.getString(5)%></td>
						<td><%=resultSet.getString(6)%></td>
						<td><%=resultSet.getString(7)%></td>	
					</tr>
				<%} %>	
			
				</tbody>	
			</table>	
						
			<%if(flag==false){ %>
			
				<h3 style="color:#ef1818f0;">id<%=" "+std_id+" " %>not present in database...</h3>
							
			<%} %>
			
		<%}catch(Exception e){ %>
			<%=e %>
		<%} %>		
	

</body>
</html>