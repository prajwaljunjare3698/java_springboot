<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%String name = request.getParameter("name"); %>   
<%String password = request.getParameter("password"); %>   
<%String email = request.getParameter("email"); %>   
<%String contact = request.getParameter("contact"); %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","tiger");
			
			String query = "insert into studentdetail(name,email,password,contact) values(?,?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			// inerting record in studentdetail table
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email); 
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, contact);
			
			// inserting username and password in std_user_pass table for 
			// furture student accessing purpose...
			
			//saving both inserted record in both tables...
			preparedStatement.executeUpdate();
					
			out.println("<h2>student saved</h2>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	
	%>



</body>
</html>