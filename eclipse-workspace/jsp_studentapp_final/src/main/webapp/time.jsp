<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <body>
      
         <h2>JSP Auto Refresh Example</h2>
         <%
            // Set refresh with autoload time 1 seconds
            response.setIntHeader("Refresh", 1);
            
            // Get current time
            Calendar calendar = new GregorianCalendar();
            
            int hour = calendar.get(Calendar.HOUR);
            int min = calendar.get(Calendar.MINUTE);
            int sec = calendar.get(Calendar.SECOND);
            
            String meridiem;
            if(calendar.get(Calendar.AM_PM) == 0)
               meridiem = "AM";
            else
               meridiem = "PM";
            String time = hour+":"+ min +":"+ sec +" "+ meridiem;
            out.println("Crrent Time: " + time + "\n");
         %>
      
      
  
      
      
      
      
   
   </body>
</html>