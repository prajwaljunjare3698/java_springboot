<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! int no=0; %>
<% no = Integer.parseInt(request.getParameter("number")); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! boolean flag = true; %>

	<%  for(int i=2;i<no;i++){
			if(no%i==0){
				out.println("<h2>"+no+" is not prime</h2>");
				flag=false;
				break;
			}
		}
		if(flag==true){
			out.println("<h2>"+no+" is prime</h2>");
		}	
	%>
	
	<h2>End of the program</h2>

	<%Thread.sleep(2000); %>


</body>
</html>