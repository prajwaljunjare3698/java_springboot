<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	a{
		text-decoration: none;
		font-size: 12px;
		color: blue;
		margin-left: 70px;
	} 

	#content{
		background-color: rgb(47 205 136);
		justify-content: center;
		height: 307px;
		width: 300px;
		border: 1px solid;
		margin:auto;
		margin-top: 60px;
        box-shadow: 13px 14px 19px 0px;
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
        margin-left:80px;
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
  		background-image: url("./sunrise-ge0e1d8ba0_1920.jpg");
		background-repeat: no-repeat;
		background-size: cover;	
	}
	
 	h2{
		font-family: serif;
		font-size: 30px;
		color: #efe80c;
   		text-align: center;		
	}
	
	
	
</style>
</head>
<body>

	<jsp:include page="homepage_start.jsp"></jsp:include>

<div id="content">
	<form action="./forgot_pass2_1.jsp" method="post">
		<h2>Enter details</h2>
		<div id="middle">
			<label>Enter email:</label>
			<input type="email" name="email"> <br>
			
			<label>Enter dept:</label>
			<input type="text" name="dept"> <br>
			
			<input id="submit" type="submit" name="confirm">	
		</div>
	</form>
</div>
</body>
</html>