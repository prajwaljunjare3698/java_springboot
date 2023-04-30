<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String input = request.getParameter("input"); %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%=input %>
	
	<%if(input.equals("songtable")) {%>
		<jsp:forward page="songtable.jsp" />
		
	<% } else if(input.equals("play"))  {%>
		<jsp:forward page="play.jsp" />
		
	<%}  else if(input.equals("addremove"))  { %>
		<jsp:forward page="addremove.jsp" />
		
	<%}  else if(input.equals("update"))  { %>
		<jsp:forward page="update.jsp" />
	<%} %>
</body>
</html>