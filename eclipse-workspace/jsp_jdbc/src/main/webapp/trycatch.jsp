<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! int a = 10,b=0; %>

	<%-- first way(direct) --%>
		<%
			try{ 
				out.println(a/b);				
			}
			catch(Exception e){			
			}
		%>
	
	<%-- 2nd way --%>
	<% try { %>
	
		<% int c = a/b;%>
		<%= c %>
	
	<%} catch(Exception e){ %>
		<%= e %>
	<%} %>
	
</body>
</html>