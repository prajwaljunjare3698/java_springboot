<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! int a=10;  %>	<%-- declaration tag --%>
	<%! int b=20; %>
	<%! int c=0; %>
	
	<% c=a+b; %>		<%-- scriptlet tag(for logic) --%>
	
	<h2><%= c %></h2>	<%-- display tag --%>
	
	<%! %>
	
	

</body>
</html>