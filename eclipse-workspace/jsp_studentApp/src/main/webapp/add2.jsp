<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%! Connection connection; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<%! String query; %>

<%String name = request.getParameter("name"); %>
<%String email = request.getParameter("email"); %>
<%String contact = request.getParameter("contact"); %>
<%String course = request.getParameter("course"); %>
<%String gender = request.getParameter("gender"); %>
<%String place = request.getParameter("place"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	
	<jsp:include page="homepage.jsp"/>

	<h2>This is add2</h2>
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query = "insert into studentdetail(name,email,contact,course,gender,place) values(?,?,?,?,?,?)"; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			
			<%preparedStatement.setString(1, name); %>
			<%preparedStatement.setString(2, email); %>
			<%preparedStatement.setString(3, contact); %>
			<%preparedStatement.setString(4, course); %>
			<%preparedStatement.setString(5, gender); %>
			<%preparedStatement.setString(6, place); %>
			
			<%preparedStatement.executeUpdate(); %>
			
			<h3><%=name+" "%> record saved in database...</h3>
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	

</body>
</html>