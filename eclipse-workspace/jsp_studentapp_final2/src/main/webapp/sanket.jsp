<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<script>
	
	function myFunction2(){

		var getInput1=document.getElementById("getInput");

		document.getElementById("showvalue").innerText= getInput1.value;
		}
	
	</script>


	
		<label>Enter username:</label>
		<input type="text" id="username" name="username"> <br>
		
		<label>Enter password</label>
		<input type="password" id="password" name="password">
		
		<input type="button" value="comfirm" onclick="myFuction2()">


</body>
</html>