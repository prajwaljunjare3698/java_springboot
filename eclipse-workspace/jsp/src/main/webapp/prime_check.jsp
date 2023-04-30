<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<h2>this is the jsp page</h2>

	<%! int i = 0; %>
	<%! int flag = 0; %>
	<%! int no = 0; %>
	
	<label>Enter any no:</label>
	<input type="text" name="number" > <br>
	<input type="submit" name="submit">
	
	<% String submit = request.getParameter("submit"); %>
	<% String input = request.getParameter("number"); %>
	
	<%	if(input!=null && submit!=null)
		
		no = Integer.parseInt(input); 
	 
		for(i=2;i<no;i++){
			if(no%i==0){
				out.println("not");
				flag=1;
			
				break;
			}
		}
		if(flag==0){
			out.println("<h2>"+no+" is prime no</h2>");
		}
		
	%>
	
	
	
	
	
	
	
	

</body>
</html>