<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int i=0; %>
	<%-- This will work fine --%>
	<% for(i=1;i<=6;i++) { %>		
		
			<h2> <%=i %> </h2>
		<%} %>	
	<%-- output is 1,2,3,4,5,6 --%>
	
	
	
	
	
	
	<%-- This will not work fine --%>
	<% for(i=1;i<=6;i++) { %>		
		
			<h2> <%=i %> </h2>
		<%} %>	
	<%-- output is 7 only --%>
	


</body>
</html>