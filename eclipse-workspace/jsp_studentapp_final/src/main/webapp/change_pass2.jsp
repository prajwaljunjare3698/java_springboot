<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
    
<%
	String password = request.getParameter("password"); 
	String active_user = (String)session.getAttribute("active_user");      
	session.setAttribute("active_user",active_user ); 
%>
   

<% 
	 Connection connection; 
	 String driver = "com.mysql.cj.jdbc.Driver"; 
	 PreparedStatement preparedStatement; 
	 ResultSet resultSet; 
	 String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	 String query = "update admin_login set password = "+'"'+password+'"'+"where username="+'"'+active_user+'"';
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h4{
		margin-left: 139px;
    	font-size: 39px;	
    	color: darkred;
	}
	.link{
		font-family: sans-serif;
	    font-size: 16px;
	    background-color: #d94e4e;
	    margin-left: 139px;
	    margin-top: 39px;
	    padding: 8px 9px 11px 10px;
	}
	#link{
		
	}
</style>
</head>
<body>

	<%if(active_user!=null){ %>	
	
		<jsp:include page="homepage.jsp"></jsp:include>
		
		<% try { %>	
				
				<% 
					 Class.forName(driver); 
					 connection = DriverManager.getConnection(db_url,"root","tiger");  
					 preparedStatement = connection.prepareStatement(query); 
	
					 preparedStatement.executeUpdate();
			    
			    %>		
				
							
			<h4>password change successfully...</h4>
				<%Thread.sleep(8000); %>	
			
			<!-- <a id="link" class="link" href="homepage.jsp">stay sign in</a> -->	
			
			<a id="link" class="link" href="login_form1.jsp">login again</a>
			
				<h1>You are going to login page to sign in again...</h1>

			<% session.invalidate(); %>
				
						
			<%response.sendRedirect("login_form1.jsp"); %>
			 	
		<%}catch(Exception e){ %>
			<%=e %>
		<%} %>

	
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>

</body>
</html>