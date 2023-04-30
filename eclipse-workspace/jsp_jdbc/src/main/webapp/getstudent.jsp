<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background-color: rgb(95, 158, 160);
	}
	#box{
		height: 400px;
		width: 400px;
		border: 1px solid;
		margin: auto;
		margin-top: 80px;
		background-color: greenyellow;
		padding: 10px;
		font-size: 20px;
		border-radius: 18px;
		box-shadow: 13px 11px 14px 1px;
	}
	h2{
		margin-left: 48px;
		color:rgb(255, 69, 0);
	}
	h1{
		margin-left: 70px;
	}
	.ap{
		margin-left: 40px;
	}
	#pass{
		margin-left: 11px;
	}
	#contact{
		
		margin-right: -28px;
	}
	#gmail{
		margin-left: 11px;
	}
	#gender{
		padding-right: 60px;
	}
	#course{
		margin-left: 82px;
	}
	#male{
		margin-left: 18px;
	}
	#place{
		margin-left: 46px;
	}
	select{
		height: 22px;
		width: 100px;	
		margin-left: 41px;
	}
	h3{
		color:rgb(255, 215, 0);
	}
	#contact{
		margin-left: 50px;
	}
	
</style>

</head>
<body>
	
	
<div id="box">
		<marquee>Wellcome To Qspiders your dream job is here</marquee>
		
		<h2>Student Registration</h2>
		
		<form action="./studentjdbc3.jsp" method="post">
		
			<label for="name">Enter Name:</label>
			<input class="ap" type="text" name="name" id="name"> <br>
			
			<label for="password">Enter Password:</label>
			<input class="ap" type="password" name="password" id="pass" required="required"> <br>
			
			<label for="email">Enter Email:</label>
			<input class="ap" type="email" name="email" id="email"> <br>
			
			<label for="contact">Enter Mob:</label>
			<input class="ap" type="number" name="contact" id="contact"> <br>
			
			<input type="submit" value="submit">
			<input type="reset" name="reset">
			
		</form>
	</div>

</body>
</html>