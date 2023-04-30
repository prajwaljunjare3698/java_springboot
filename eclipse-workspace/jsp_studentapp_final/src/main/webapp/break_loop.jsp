<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Break Loop</title>
</head>
<body>    

	
    <H1>use break statement in jsp code</H1>
    <% double array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};%>
    
       <% int sum = 0;int i = 0; %> 
       
       <%
	       while(i<array.length){ 
	       		out.println("we are in loop");
	       		
	       		sum += array[i]; 
	       		
	       		if(sum > 12) { 
	       			break; 
	       		}
	       }
     
       %>
       <h4>The sum exceeded the max allowed value 12.</h4>
  

</body>
</html>