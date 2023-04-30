<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%! String name; %>
<%! String password; %>
<%! String email; %>
<%! String contact; %>

<% name = request.getParameter("name"); %>   
<% password = request.getParameter("password"); %>   
<% email = request.getParameter("email"); %>   
<% contact = request.getParameter("contact"); %>      

<%! Connection connection; %>
<%! PreparedStatement preparedStatement; %>
<%! String query; %>

     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%try { %>
	
		<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
		<% connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","tiger");  %>
		<% query = "insert into studentdetail(name,email,password,contact) values(?,?,?,?)"; %>
	
		<% preparedStatement = connection.prepareStatement(query); %>
	
		<%  preparedStatement.setString(1, name);  %>
		<%  preparedStatement.setString(2, email);  %>
		<%  preparedStatement.setString(3, password);  %>
		<%  preparedStatement.setString(4, contact);  %>
	
		<%  preparedStatement.executeUpdate();  %>
		
		<h2> <%=name+"record saved sucessfully..." %> </h2>
		
	<%} catch(Exception e) {%>
		
		<%=e %>
		
	<%} %>
	
	

</body>
</html>