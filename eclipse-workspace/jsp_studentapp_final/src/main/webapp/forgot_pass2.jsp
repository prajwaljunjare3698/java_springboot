<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%! Connection connection; %>
<%! ResultSet resultSet; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<% String query = "select * from admin_login"; %>

<% String email = request.getParameter("email"); %>
<% String dept = request.getParameter("dept"); %>
<%! boolean flag = false; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2{
		margin-right: 100px;
		font-size: 24px;
	
	}
	#userpass{
		height: 170px;
		width: 400px;
	}
</style>

</head>
<body>

	<jsp:include page="homepage_start.jsp"></jsp:include>
	
	<% try { %>
			
			<% 
				 Class.forName(driver); 
				 connection = DriverManager.getConnection(db_url,"root","tiger");  
				 preparedStatement = connection.prepareStatement(query); 
				 resultSet = preparedStatement.executeQuery(); 
			%>
		
			<% while(resultSet.next()) {%>
			
				<% if(email.equals(resultSet.getString(3)) && dept.equals(resultSet.getString(4))) {%>
											
					<div id="userpass">
						<h2>username is <span><%=" "+resultSet.getString(5) %></span> and password is <span><%=resultSet.getString(6) %></span></h2>
						<h4>login and change your password...</h4>
					</div>
															
					<% flag=true; %> 
				<% }%>			
				<% if(flag==true){ %> 					
					<%break; %>					
				<% }%>	
					
			<%} %>
			<% if(flag==false) { %>	
				
				<jsp:forward page="forgot_pass3.jsp"/>	
			
		<%} } catch (Exception e) { %>
			<%=e %>
			
		<%} %>		

	

</body>
</html>