<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%! Connection connection; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! PreparedStatement preparedStatement; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>
<%! String query; %>    
    
<% int id = Integer.parseInt(request.getParameter("id")); %>
<% String name = request.getParameter("name"); %>    
<% String email = request.getParameter("email"); %>    
<% String contact = request.getParameter("contact"); %>    
<% String course = request.getParameter("course"); %>    
<% String gender = request.getParameter("gender"); %>    
<% String place = request.getParameter("place"); %>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2{
		color: red;
		font-size: 25px;
	}
</style>
</head>
<body>
	
	<jsp:include page="homepage.jsp"></jsp:include>
	
	<%=id+" "+name+" "+email+" "+contact+" "+gender+" "+course+" "+place %>
	
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			<% query ="update studentdetail set name="+"\""+name+"\""+","+"email="+"\""+email+"\""+","+"course="+"\""+course+"\""+","+"place="+"\""+place+"\""+" where id="+id+""; %>
			<% preparedStatement = connection.prepareStatement(query); %>
			<% preparedStatement.executeUpdate(); %>
						
			<h2><%=name+" "%> updated successfully.... </h2>	
			
					
			<% Thread.sleep(3000); %>
			
			
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>


</body>
</html>