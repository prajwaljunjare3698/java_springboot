<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<div id="box">
		<marquee>Wellcome To Qspiders your dream job is here</marquee>
		
		<h2>Student Registration</h2>
		
		<form action="./getstudentdata" method="post">
		
			<label for="name">Enter Name:</label>
			<input class="ap" type="text" name="name" id="name"> <br>
			
			<label for="password">Enter Password:</label>
			<input class="ap" type="password" name="password" id="pass" required="required"> <br>
			
			<label for="email">Enter Email:</label>
			<input class="ap" type="email" name="email" id="email"> <br>
			
			<label for="contact">Enter Mob:</label>
			<input class="ap" type="number" name="contact" id="contact"> <br>
			
			<label id="gender" for="gender">Gender:</label>
			
			<input  type="radio" name="gender" id="male" value="male">
			<label for="male">Male</label>
			
			<input type="radio" name="gender" id="female" value="female">
			<label for="female">Female</label> <br>
			
			<label  for="place">Enter Place:</label>
			<input class="ap" type="text" name="place" id="place"> <br> 	
			
			<label for="course">Course:</label>
			<select id="course" name="course">
				<option selected disabled>Select</option>
				<option>Java</option>
				<option>Python</option>
				<option>WetTech</option>
				<option>Selenium</option>
			</select>
			<br> <br>
			<input type="checkbox" name="check">accept terms and conditions <br>
					
			<input type="submit" value="submit">
			<input type="reset" name="reset">
			
		</form>
	</div>


</body>
</html>