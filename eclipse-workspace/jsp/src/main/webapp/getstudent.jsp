<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	body {
	background-image: linear-gradient(orange,white,green);
	background-repeat: no-repeat;s
}
	
</style>

</head>
<body>

<fieldset>

<legend>Student Form</legend>
<br> <br>


<form action="./studentdetails.jsp" method="get">
		
		
			<label for="name">Enter Name:</label>
			<input class="ap" type="text" name="name" id="name"> <br>
			
			<label for="username">Enter UserName:</label>
			<input class="ap" type="text" name="username" id="username"> <br>
			
			<label for="password">Enter Password:</label>
			<input class="ap" type="password" name="password" id="pass" required="required"> <br>
			
			<label for="email">Enter Email:</label>
			<input class="ap" type="email" name="email" id="email"> <br>
				
			<input type="submit" value="submit">
			<input type="reset" name="reset">
			
		</form>
	</fieldset>

</body>
</html>