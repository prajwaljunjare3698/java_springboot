<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
</head>
<body>
	
	<jsp:include page="homepage.jsp"></jsp:include>
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "select * from studentdetail"; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
						
			
			<%while(resultSet.next()) {%>	
			
				<form action="./update2.jsp" method="post">
				
					<h4><%=resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)
						+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+ resultSet.getString(6)+" "+ resultSet.getString(7)%>
													
						<input type="submit" value="edit" > 	
						<input type="hidden" name="id" value="<%=resultSet.getInt(1)%>" >
									
					</h4>
				</form>
					
			<%} %>					
			
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	

</body>
</html>