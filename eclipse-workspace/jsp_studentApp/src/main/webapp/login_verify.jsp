<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
    
<%String username = request.getParameter("username"); %>   
<%String password = request.getParameter("password"); %> 

<%! boolean flag = false; %>
<%! Connection connection; %>
<% String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<%! String query = "select username,password from admin_login"; %>
<% ResultSet resultSet; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>This is verify_login page</h2>
		
		<% try { %>
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
		
			<% while(resultSet.next()) {%>
			
				<% if(username.equals(resultSet.getString(1)) && password.equals(resultSet.getString(2))) {%>
					
					<jsp:forward page="homepage.jsp"/>
					<% flag=true; %> 
					
				<%} %> 
			<%} %>
			
			<% if(flag==false) { %>	
				
				<jsp:forward page="login_form2.jsp"/>					
			
		<%} } catch (Exception e) { %>
			<%=e %>
			
		<%}finally{ %>			
			<% if(connection!=null && preparedStatement!=null){ %> 
				<% try { %>
				
					<%connection.close(); %>
					<%preparedStatement.close(); %>
													
				<%}catch (Exception e) { %>						
					<%=e %>								
				<%} %>		
			<%} %>		
		<%} %>
	

</body>
</html>