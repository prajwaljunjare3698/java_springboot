<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page errorPage="error_page.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>here the output of your result</h2>
	<%
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");
	
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);
	int c = a/b;
	%>
	<h2>The division is <%=c %> </h2>
	
</body>
</html>