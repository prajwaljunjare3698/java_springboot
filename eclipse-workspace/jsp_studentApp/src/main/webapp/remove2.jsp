<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<% String id = request.getParameter("user"); %> 	 
 
<%! Connection connection; %>
<%! ResultSet resultSet1; %>
<%! ResultSet resultSet2; %>
<%! String driver = "com.mysql.cj.jdbc.Driver"; %>
<%! String db_url = "jdbc:mysql://localhost:3306/jsp"; %>

<%! PreparedStatement preparedStatement0; %>
<%! PreparedStatement preparedStatement1; %>
<%! PreparedStatement preparedStatement2; %>
<%! PreparedStatement preparedStatement3; %>
<%! String query0; %>    
<%! String query1; %>    
<%! String query2; %>    
<%! String query3; %>    
<%! String std_name; %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h3{
		font-family: monospace;
		color: red;
	}

</style>
</head>
<body>
	
	<jsp:include page="homepage.jsp"></jsp:include>
	
	<% try { %>	
			
			<% Class.forName(driver); %>
			<% connection = DriverManager.getConnection(db_url,"root","tiger");  %>
			
			<% query0 = "select * from studentdetail where id="+id+"";%>
			<% preparedStatement0 = connection.prepareStatement(query0); %>
			<% resultSet1 = preparedStatement0.executeQuery(); %>
			
			<%while(resultSet1.next()) {%>			
				<% std_name = resultSet1.getString(2); %>				
			<%} %>	
						
			<% query1 = "delete from studentdetail where id="+id+""; %>
			<% preparedStatement1 = connection.prepareStatement(query1); %>
			<%preparedStatement1.executeUpdate(); %>
					
						
		<%-- 
			<% query2 = "update studentdetail set id = id - 1 where id > 1"; %>
			<% preparedStatement2 = connection.prepareStatement(query2); %>
			<%preparedStatement2.executeUpdate(); %>
		--%>	
			
			<% query3 = "select * from studentdetail"; %>
			<% preparedStatement3 = connection.prepareStatement(query3); %>
			<% resultSet2 = preparedStatement3.executeQuery(); %>
			
			<%while(resultSet2.next()) {%>
			
				<form action="./remove2.jsp" method="post">	
			
				<h4><%=resultSet2.getInt(1)+" "+resultSet2.getString(2)+" "+resultSet2.getString(3)
				+" "+resultSet2.getString(4)+" "+resultSet2.getString(5)+" "+ resultSet2.getString(6)%>
									
					<input type="submit" name="delete" value="delete" > 	
					<input type="hidden" name="user" value="<%=resultSet2.getInt(1)%>" >
				
				</h4>	
			</form>
				
			<%} %>		
			
			
			<h3><%="id no "+id +"  "%><%=std_name+" "%>Student deleted...</h3>
	
	<%}catch(Exception e){ %>
		<%=e %>
	<%} %>
	
	
	

</body>
</html>