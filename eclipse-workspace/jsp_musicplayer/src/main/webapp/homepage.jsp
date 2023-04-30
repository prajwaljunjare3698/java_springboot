<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<form action="./getinput.jsp" method="post">
		<table>		
			<tr>
				<td><label for="songtable">Show song table</label></td>
				<td> <input type="radio" name="input" value="songtable"></td>
			</tr>
			<tr>
				<td><label for="play">play</label></td>
				<td> <input type="radio" name="input" value="play" ></td>
			</tr>
			<tr>
				<td><label for="addremove">addremove</label></td>
				<td> <input type="radio" name="input" value="addremove" ></td>
			</tr>
			<tr>
				<td><label for="update">update</label></td>
				<td> <input type="radio" name="input" value="update" ></td>
			</tr>
			<tr>
				<td><label for="exit">exit</label></td>
				<td> <input type="radio" name="input" value="exit" ></td>
			</tr>
			<tr>
				<td> <input type="submit" value="submit" ></td>
			</tr>
		</table>
	</form>

</body>
</html>