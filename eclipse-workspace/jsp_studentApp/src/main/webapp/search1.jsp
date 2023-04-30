<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<% String id = request.getParameter("id"); %>
<% String email = request.getParameter("email"); %>

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
</head>
<body>

	<%=id %>
	<%=email %>
	<jsp:include page="homepage.jsp"></jsp:include>
	<% if(id==null){ %>
	
	<form action="./search1.jsp" method="post">	
		<label>Enter id</label>
		<input type="text" name="id" autofocus>	
		<input type="submit" name="confirm">	
	</form>
	
	<%} else{%>
		
		<% try { %>	
		
			<form action="./search1.jsp" method="post">	
				<label>Enter id</label>
				<input type="text" name="id" autofocus>		
				<input type="submit" name="confirm">	
			</form>
			
			<% Class.forName(driver); %>
			<% int std_id = Integer.parseInt(id); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "select * from studentdetail where id="+std_id+""; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% resultSet = preparedStatement.executeQuery(); %>
						
			<%while(resultSet.next()) {%>	
				<%=
				 	resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)
					+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+ resultSet.getString(6)
				%>
					
			<%} %>					
		
		<%}catch(Exception e){ %>
			<%=e %>
		<%} %>		
	
	<%} %>
	

</body>
</html>