<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! int no=7; %>		<%--declaration tag --%>
	<%! int i; %>		<%--declaration tag --%>
	<%! int flag=0; %>
	
	<% for(i=2;i<no;i++) 	
	{
		if(no%i==0){
			 flag=1; 
			 break;
		}
	}	
	if(flag==0){
		out.println("<h2>no "+no+" is prime no</h2>");
	}
	
	%>


</body>
</html>