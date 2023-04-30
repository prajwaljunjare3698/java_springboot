<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%String active_user = (String)session.getAttribute("active_user");  %>  --%>   
<%! String active_user ;  %>    
<%session.setAttribute("active_user",active_user ); %>    
    
<h3>active user:<span><%=active_user%></span></h3>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%session.invalidate(); %>
	
	<%response.sendRedirect("homepage_start.jsp"); %>

</body>
</html>