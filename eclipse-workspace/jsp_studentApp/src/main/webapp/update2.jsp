<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<% int id = Integer.parseInt(request.getParameter("id")); %> 

<%! Connection connection; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement1; %>
<%! PreparedStatement preparedStatement2; %>
<%! ResultSet resultSet1; %>
<%! ResultSet resultSet2; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<%! String query1; %>    
<%! String query2; %>    
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
			<% query1 = "select * from studentdetail where id="+id+""; %>
			<% preparedStatement1 = connection.prepareStatement(query1); %>
			<% resultSet1 = preparedStatement1.executeQuery(); %>
			
			<% query2 = "select * from studentdetail"; %>
			<% preparedStatement2 = connection.prepareStatement(query2); %>
			<% resultSet2 = preparedStatement2.executeQuery(); %>
			
			<%while(resultSet2.next()) {%>	
			
				<%if(id==resultSet2.getInt(1)){ %>
				
					<%while(resultSet1.next()){ %>
					
					<form action="./update3.jsp" method="post">
						
						<input type="hidden" name="id" value="<%=resultSet1.getInt(1)%>" >		
							
						<input type="text" name="name" value="<%=resultSet1.getString(2)%>">
						<input type="text" name="email" value="<%=resultSet1.getString(3)%>">
						<input type="text" name="contact" value="<%=resultSet1.getString(4)%>">
						<input type="text" name="course" value="<%=resultSet1.getString(5)%>">
						<input type="text" name="gender" value="<%=resultSet1.getString(6)%>">
						<input type="text" name="place" value="<%=resultSet1.getString(7)%>">
						
						<input type="submit" value="confirm" > 							
						
					</form>
					
					<%} %>
				
				<%} else{ %>
				
					<h4><%=resultSet2.getInt(1)+" "+resultSet2.getString(2)+" "+resultSet2.getString(3)
					+" "+resultSet2.getString(4)+" "+resultSet2.getString(5)+" "+ resultSet2.getString(6)+" "+ resultSet2.getString(7)%>
					</h4>
					
					<%} %>		
				
				
			<%} %>					
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	

</body>
</html>