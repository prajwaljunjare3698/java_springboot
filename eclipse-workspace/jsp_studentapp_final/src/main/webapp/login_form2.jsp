
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	#content{
		background-color: rgb(118, 219, 34);
		justify-content: center;
		height: 330px;
		width: 300px;
		border: 1px solid;
		margin:auto;
		margin-top: 70px;
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
	span {
		font-size: 21px;
		color: red;
		margin-top: 125px;
		margin-left: 84px;
	}
	
</style>
</head>
<body>

		
		<jsp:include page="homepage_start.jsp"></jsp:include>

<div id="content">
	<form action="./login_verify.jsp" method="post">
		<h3>admin Login Page</h3>
	
        <div id="middle">

            <label for="username">Enter UserName:</label>
            <input type="text" name="username" id="username" required >
            <br>
            
            <label for="password">Enter Password:</label>
            <input type="password" name="password" id="password" required>
            <br>
            
            <input type="submit" name="submit" id="submit">
            <input type="reset" name="reset" id="reset"> <br>
            
            <span>Invalid user/password</span>
            <a href="./forgot_pass1.jsp">forgot username/password</a>
        </div>
	</form>
</div>


</body>
</html>