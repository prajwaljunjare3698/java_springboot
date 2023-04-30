<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is first JSP page</h1>
	<%!
		int a =10;
		String s = "abc";
		public static String rev(String s){
			StringBuffer sb = new StringBuffer(s);
			return sb.reverse().toString();
			
		}
	%>
	<h2>value is are </h2>
	<%
		out.print("value of a is "+a);
		out.print("reverse of abc "+s);
	%>
	
	<h4>the reverse is <%=rev(s) %></h4>
	
</body>
</html>