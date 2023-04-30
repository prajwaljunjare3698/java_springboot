<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background-image: url("./sunrise-ge0e1d8ba0_1920.jpg");
		background-repeat: no-repeat;
		background-size: cover;
	}
	h2{
		font-family: serif;
		font-size: 30px;
		color: #ccef0c;
   		text-align: center;
		
	}
	a{
		text-decoration: none;
		font-size: 18px;
		color: #e8f5e9;
		padding: 13px 21px 16px 14px;
	    background-color: #e32112;
	    border-radius: 17px;
		margin-left: 70px;
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
	
	#admin_form{
		height: 400px;
		width: 300px;
		border: 1px solid;
		border-radius: 16px;
		margin: 0 auto;
		margin-top: 15px;
		background-color: #72cfc9;;
		font-size: 20px;	
	}
	#inside_content{
		margin-left: 40px;
		margin-top: 44px;
	}

</style>
</head>
<body>

		<h2>Add admin</h2>
		
		<a href="./login_form1.jsp">admin Login</a>
		<a href="./add_admin1.jsp">Add new admin</a>
	
	<div id="admin_form">	
	<div id="inside_content">
		<form action="./add_admin2.jsp" method="post">
		
			<label>Enter Employee name:</label>
			<input type="text" name="name" autofocus="autofocus" required="required"> <br>
			
			<label>Enter Employee email:</label>
			<input type="email" name="email" required="required"> <br>
								
			<label>Enter Employee dept:</label>
			<input type="text" name="dept" required="required"> <br>
			
			<label>Create username:</label>
			<input type="text" name="username" required="required"> <br>
				
			<input id="submit" type="submit" value="confirm">
			<input id="reset" type="reset" value="reset">
			
		</form>
	</div>
	</div>


</body>
</html>