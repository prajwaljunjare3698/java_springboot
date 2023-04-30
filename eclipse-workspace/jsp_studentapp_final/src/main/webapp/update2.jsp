<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
	String active_user = (String)session.getAttribute("active_user");   
	session.setAttribute("active_user",active_user );     
	int id = Integer.parseInt(request.getParameter("id")); 
%> 
    

<%! 
	 Connection connection; 
	 String driver = "com.mysql.cj.jdbc.Driver";
	 PreparedStatement preparedStatement1; 
	 PreparedStatement preparedStatement2; 
	 ResultSet resultSet1; 
	 ResultSet resultSet2; 
	 String db_url = "jdbc:mysql://localhost:3306/jsp"; 
	 String query1; 
	 String query2;
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	span {
		font-size: 18px;
		text: bold;
	}
	h3{
		font-family: monospace;
		color: red;
	}
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 90;
	  margin-left: 70px;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: left;
	  padding: 10px;
	}
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	thead {
		background-color: #5dc7a78f;
	}
	.inp{
		height: 23px;
		width: 170px;
		font-size: 16px;
		border: none;
		outline: none;
	}
	#course{
		border-radius: 8px;
	    padding: 5px;
		width:100%;
		background-color: #a0c8eb;
		outline: none;
	}
	#gender{
		border-radius: 8px;
	    padding: 5px;
		width:100%;
		background-color: #a0c8eb;
		outline: none;
	}
	
</style>

</head>
<body>

	<%if(active_user!=null){ %>

	<jsp:include page="homepage.jsp"></jsp:include>
	
	<br><br>
	<% try { %>	
			
			<%
				 Class.forName(driver); 
				 connection = DriverManager.getConnection(db_url,"root","tiger");  
				 query1 = "select * from studentdetail where id="+id+""; 
				 preparedStatement1 = connection.prepareStatement(query1); 
				 resultSet1 = preparedStatement1.executeQuery(); 
				
				 query2 = "select * from studentdetail"; 
				 preparedStatement2 = connection.prepareStatement(query2); 
				 resultSet2 = preparedStatement2.executeQuery(); 
			 %>
			
			
			<table>
				<thead>
					<tr>
						<td><b>Id</b></td><td><b>Name</b></td><td><b>Email</b></td><td><b>Contact</b></td><td><b>Course</b></td><td><b>Gender</b></td><td><b>Place</b></td>
					</tr>
				</thead>
			
				<tbody>	
			<%while(resultSet2.next()) {%>	
			
				<%if(id==resultSet2.getInt(1)){ %>
				
					<%while(resultSet1.next()){ %>
								
				<tr>	
						<td><span><b><%=resultSet1.getInt(1)%></b></span></td>		
										
						<form action="./update3.jsp" method="post">	
						
							<td><input class="inp" type="text" name="name" value="<%=resultSet1.getString(2)%>" autofocus="autofocus"></td>
							<td><input class="inp" type="email" name="email" value="<%=resultSet1.getString(3)%>" required="required"></td>
							<td><input class="inp" type="number" name="contact" value="<%=resultSet1.getString(4)%>"  title="Error Message" pattern="[1-9]{1}[0-9]{9}"></td>
							
							<td>
								<select id="course" name="course">
									<option selected disabled><%=resultSet1.getString(5)%></option>
			 						<option>Java</option>
									<option>Python</option>
									<option>WetTech</option>
									<option>Selenium</option>
								</select>     
							</td>
							
							<td>
								<select id="gender" name="gender">
									<option selected disabled><%=resultSet1.getString(6)%></option>
									<option>Male</option>
									<option>Female</option>
								</select>
				 			</td>
														
							<td><input style="height: 23px;	width:100px;font-size: 16px;border: none;outline: none;" 
								 type="text" name="place" value="<%=resultSet1.getString(7)%>" required="required"></td>
							
							<input type="hidden" name="id" value="<%=resultSet1.getInt(1)%>" >		
							<td><input type="submit" value="confirm" ></td>						
						</form>
				</tr>	
					<%} %> 
					
				<%} else{ %>
				
				<tbody>
					<tr>
						<td><%=resultSet2.getInt(1)%></td>
						<td><%=resultSet2.getString(2)%></td>
						<td><%=resultSet2.getString(3)%></td>
						<td><%=resultSet2.getString(4)%></td>
						<td><%=resultSet2.getString(5)%></td>
						<td><%=resultSet2.getString(6)%></td>
						<td><%=resultSet2.getString(7)%></td>	
					</tr>					
					<%} %>		
			<%} %>					
				</tbody>
			</table>
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	
	<%}else{ %>
		<jsp:forward page="login_form1.jsp"></jsp:forward>
	<% }%>

</body>
</html>