<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
  
<%! Connection connection; 
	String driver = "com.mysql.cj.jdbc.Driver"; 
	PreparedStatement preparedStatement; 
	String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	String query; 
%>

<%	
	String name = request.getParameter("name");    
	String email = request.getParameter("email");   
	String dept = request.getParameter("dept");    
	String username = request.getParameter("username"); 
%>   
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background-image: url("./sunrise-ge0e1d8ba0_1920.jpg");
		background-repeat: no-repeat;
		background-size: cover;
	}
	h2{
		font-family: serif;
		font-size: 40px;
		color: #fff700;
   		text-align: center;
		
	}
	a{
		text-decoration: none;
		font-size: 18px;
		color: #e8f5e9;
		padding: 13px 21px 16px 14px;
	    background-color: #e32112;
	    border-radius: 17px;
		margin-left: 70px;
	}
	#box{
		height: 170px;
		width: 400px;
		border: 1px solid;
		border-radius: 16px;
		background-color: #dcf105e6;
		margin: 0px auto;
		margin-top: 70px;
		padding: 12px 11px 1px 32px;
	}
	span{
		color: purple;
		font-size: 26px;
		
	}

</style>

</head>
<body>

	<%--Generating password for user... --%>

	<jsp:include page="homepage_start.jsp"></jsp:include>
	<%!
		int arr1[] = {97,122};
		int arr2[] = {49,57};
		int arr3[] = {35,36,37,38,64};
		String password = ""; 
	%>
	<%for(int i=1;i<=2;i++){ %>		
		
		
		<% 
		
		  /*  double first = Math.random() * (max - min + 1) + min; */ 
		   double first = Math.random() * (arr1[1] - arr1[0] + 1) + arr1[0]; 
		   int a = (int)first; 
		
		   double second = Math.random() * (arr2[1] - arr2[0] + 1) + arr2[0]; 
		   int b = (int)second; 
		
		
		   double third = Math.random() * (4 - 0 + 1) + 0; 
		
		   int c = (int)third; 
		   int d = arr3[c]; 
		
		
			char p1 = (char) a;
			char p2 = (char) b;
			char p3 = (char) d; 
		%>
		
		<%-- 
			this is not possible in jsp  
			<% password + = c1+c2+c3; %> 
		--%>
		
		<%password = password+p1+p2+p3; %>
		
	<%} %>	

	<% try { %>	
			
			<% 
				Class.forName(driver); 
				connection = DriverManager.getConnection(db_url,"root","tiger");  
				query = "insert into admin_login(name,email,dept,username,password) values(?,?,?,?,?)"; 
				preparedStatement = connection.prepareStatement(query); 
				
				preparedStatement.setString(1, name); 
				preparedStatement.setString(2, email);
				preparedStatement.setString(3, dept); 
				preparedStatement.setString(4, username);
				preparedStatement.setString(5, password);
				
				preparedStatement.executeUpdate();
			%>
			
	
	<%}catch(Exception e){ %>
		
		<%=e %>
		
		<%} %>
		<br>
		
		
			<h2>admin added successfully...</h2>			
		<div id="box">
			<h3>username is <span><%=username %></span> and password is <span><%=password %></span></h3>
			
			<h4>Please note down your password for login purpose...</h4>
		</div>
		
		<% password = ""; %>
</body>
</html>