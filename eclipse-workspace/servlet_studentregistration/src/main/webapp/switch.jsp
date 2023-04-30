<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int a = 5; %>

	<%
		switch(a){
			case 1:
				out.println("<h2>"+1+"</h2>");				
				break;
			case 2:
				out.println("<h2>"+2+"</h2>");
				break;
			default:
				out.println("<h2>default</h2>");
		}
	%>
	
	<%-- 
		<%switch(a) { %>
			<%case 1: %>
				<%= a %>
			<%break; %>
			
			<%case 2: %>
				<%= a %>
			<%break; %>		
		<%}%>
	--%>
	
	
</body>
</html>