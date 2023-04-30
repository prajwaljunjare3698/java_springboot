<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="p" uri="http://java.sun.com/jstl/core" %>
    
    <%@ page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a = 10;
		int b = 2;
	%>
	<h3>the mul is <%=a*b %> </h3>
	
	<%
	int a =20;
	int b = 0;
	int c = a/b;
	%>
	<p:catch></p:catch>
	<h3>the div is <%=c %> </h3>
</body>
</html>