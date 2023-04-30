<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.Writer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! ArrayList<Integer> list = new ArrayList<>();%>
	
	<%
		list.add(3);
		list.add(4);
		list.add(8);
		
		out.println("<h2>"+list+"</h2>");
		
	%>
		
		
	
	
	
	
	
	
	

</body>
</html>