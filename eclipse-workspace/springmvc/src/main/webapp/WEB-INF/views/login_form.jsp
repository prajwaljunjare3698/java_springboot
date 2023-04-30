<%@page import="com.jspider.springmvc.pojo.StudentPojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%StudentPojo student = (StudentPojo) request.getAttribute("student");%>
<%String msg = (String) request.getAttribute("msg");%>
<%String verify = (String) request.getAttribute("verify"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
<style>
	a{
		text-decoration: none;
		font-size: 12px;
		color: blue;
		margin-left: 70px;
	} 
	#content{
		background-color: rgb(118, 219, 34);
		justify-content: center;
		height: 330px;
		width: 300px;
		border: 1px solid;
		margin:auto;
		margin-top: 60px;
        box-shadow: 11px 11px 12px 0px;
		padding: 12px;
		font-size: 25px;
		border-radius: 18px;
	}
	
    #middle{
        margin-left: 30px;
    }
    #middle a{
    	margin-left: 67px;
	    font-size: 19px;
	    color: #2265e1;
	    background-color: initial;
	    padding: 1px;
    }
    
	h3{
		text-align: center;
		color: rgb(85, 30, 37);
	}
		
	input{
		margin-right: 60px;
        height: 22px;
        width: 200px;
        outline: none;
        box-shadow: 6px 6px 5px -4px;
        margin-block: 6px;
	}
	
    #submit{
        margin-top: 10px;
        height: 30px;
        width: 80px;
        border-radius: 20px;
        border: none;
        background-color: aqua;
        box-shadow: 7px 7px 13px -3px;
    }
    
    #reset{
        margin-top: 10px;
        height: 30px;
        width: 80px;
        margin-left: -40px;
        border-radius: 20px;
        border: none;
        background-color: rgb(0, 255, 255);
        box-shadow: 7px 7px 13px -3px;
    }
    
    body{
  		background-image: linear-gradient(-108deg, rgb(94 176 144), rgb(206, 95, 159));
	}
	h5{
		font-size: 18px;
		color: red;
		margin-left: 28px;
		margin-top: 4px;
	}
 	h2{
		font-family: serif;
		font-size: 30px;
		color: #ccef0c;
   		text-align: center;		
	}	
	
</style>
</head>
<body>
			
	<%if(verify != null) {%>
		<h2 style="font-family: serif;font-size: 30px; text-align: center;color: #cb1313;margin-top: 71px;margin-bottom: -38px;"><%= verify %></h2> 
		
		   
		
	<%} %> 

<div id="content">
	<form action="./login" method="post">
		<h3>admin Login Page</h3>
	
        <div id="middle">
            <label for="username">Enter UserName:</label>
            <input type="text" name="username" id="username" required autofocus="autofocus" >
            <br>
            
            <label for="password">Enter Password:</label>
            <input type="password" name="password" id="password" required>
            <br>
            
            <input type="submit" name="submit" id="submit">
            <input type="reset" name="reset" id="reset">
            <!-- <a href="./forgot_pass1.jsp">forgot username/password</a> -->
            <%if(msg != null) {%>
				<h5> <%=msg %></h5>
			<%} %>
        </div>
	</form>
</div>
			
	

</body>
</html>