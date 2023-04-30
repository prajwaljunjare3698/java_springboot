<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%
	String active_user = (String)session.getAttribute("active_user");     
	session.setAttribute("active_user",active_user ); 
	String id = request.getParameter("user");  	 
%>    
     
<%!
	 Connection connection; 
	 ResultSet resultSet1; 
	 ResultSet resultSet2; 
	 String driver = "com.mysql.cj.jdbc.Driver"; 
	 String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	
	 PreparedStatement preparedStatement0; 
	 PreparedStatement preparedStatement1; 
	 PreparedStatement preparedStatement2; 
	 PreparedStatement preparedStatement3; 
	 String query0; 
	 String query1; 
	 String query2; 
	 String query3; 
	 String std_name; 
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
	
	<%if(active_user!=null){ %>
	
	<jsp:include page="homepage.jsp"></jsp:include>
	
	<br><br>
	<% try { %>	
			
			<% 
				 Class.forName(driver); 
				 connection = DriverManager.getConnection(db_url,"root","tiger");  
				
				 query0 = "select * from studentdetail where id="+id+"";
				 preparedStatement0 = connection.prepareStatement(query0); 
				 resultSet1 = preparedStatement0.executeQuery(); 
			%>
			
			<%while(resultSet1.next()) {%>			
				<% std_name = resultSet1.getString(2); %>				
			<%} %>	
						
			<%
				query1 = "delete from studentdetail where id="+id+""; 
				preparedStatement1 = connection.prepareStatement(query1);
				preparedStatement1.executeUpdate(); 
			%>
					
			
			<%
				 query3 = "select * from studentdetail"; 
				 preparedStatement3 = connection.prepareStatement(query3); 
				 resultSet2 = preparedStatement3.executeQuery(); 
			%>
			
			<table>
				<thead>
					<tr>
						<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>Course</b></td><td><b>Gender</b></td><td><b>Place</b></td><td><b>Remove</b></td>
					</tr>
				</thead>	
			
			<%while(resultSet2.next()) {%>
			
				<tbody>
				<tr>
					<td><%=resultSet2.getString(1)%></td>
					<td><%=resultSet2.getString(2)%></td>
					<td><%=resultSet2.getString(3)%></td>
					<td><%=resultSet2.getString(4)%></td>
					<td><%=resultSet2.getString(5)%></td>
					<td><%=resultSet2.getString(6)%></td>
					<td><%=resultSet2.getString(7)%></td>
					
					<form action="./remove2.jsp" method="post">		
						<input type="hidden" name="user" value="<%=resultSet2.getInt(1)%>" >									
					<td><input type="submit" value="delete" ></td>	
					</form>		
								
				</tr>
				</tbody>	
			<%} %>		
			</table>
			
			
			<h3><%="id no "+id +"  "%><%=std_name+" "%>Student deleted...</h3>
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>
	
	

</body>
</html>