<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#head{
	height: 200px;
	width: 800px;
	border: 1px solid;
	border-radius: 10px;
	display:flex;
	}
	.ss{
		height: 40px;
        width: 80px;
        padding: 4px 5px 1px 14px ;
        text-decoration: none;
        border: 1px solid;
        border-radius: 70px;
        background-color: greenyellow;           
        justify-content:space-around;
        justify-content:flex-end;
        margin-top: 20px;
        margin-left: 8px;
	}
</style>
</head>
<body>
	<div id="head">
	<h1>this is header page</h1>
		<a class="ss" href="#">Login</a>
		<a class="ss" href="#">Home</a>
		<a class="ss" href="#">Contact</a>
		<a class="ss" href="#">About us</a>
	</div>
</body>
</html>