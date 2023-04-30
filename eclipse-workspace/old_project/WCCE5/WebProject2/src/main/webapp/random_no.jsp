<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%@include file="ranodm_no1.jsp" %>

	<%
	Random rand = new Random();
	int no = rand.nextInt(1,10);
	
	//ublic static int generate(no){
	//	return no;
	//}
	%>
	
	<h2>the random no is <%= no%></h2>
	<button>click</button>
	
</body>
</html>