<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>This is add1</h2>

	<jsp:include page="homepage.jsp"/>
	
	<form action="./add2.jsp" method="post">
	
		<label>Enter student name</label>
		<input type="text" name="name" required="required"> <br>
		
		<label>Enter student email</label>
		<input type="email" name="email" required="required"> <br>
		
		<label>Enter student contact</label>
		<input type="number" name="contact" required="required"> <br>
		
		<label for="course">Course:</label>
			<select id="course" name="course">
				<option selected disabled>Select</option>
				<option>Java</option>
				<option>Python</option>
				<option>WetTech</option>
				<option>Selenium</option>
			</select>
			<br>
		
		<label id="gender" for="gender">Gender:</label>			
		<input  type="radio" name="gender" id="male" value="male">
		<label for="male">Male</label>		
		<input type="radio" name="gender" id="female" value="female">
		<label for="female">Female</label> <br>			
		
		<label>Enter student place</label>
		<input type="text" name="place"> <br>
		
		<input type="submit" value="confirm">
	
	</form>


</body>
</html>