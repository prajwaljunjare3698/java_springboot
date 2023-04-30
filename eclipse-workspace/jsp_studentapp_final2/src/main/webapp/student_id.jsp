<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
<%! int std_id=0; %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "select * from studentdetail"; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
						
			
			<%while(resultSet.next()) {%>					
				
				<% std_id++; %>
				
				<%=resultSet.getInt(1)%>				
			<%} %>				
				
				<form action="./add1.jsp" method="post">
					<input type="submit" value="submit" > 	
					<input type="hidden" name="user" value="<%=std_id%>" >				
				</form>
			
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	

</body>
</html>
