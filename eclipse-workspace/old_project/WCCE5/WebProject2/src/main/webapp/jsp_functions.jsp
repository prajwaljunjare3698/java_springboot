<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str" value="hello world"></c:set>
<h3>	Length: ${fn:length(str)} </h3>

	split <c:forEach items="${fn.split(str,' ')}" var="s">
	
		${s}
		
	</c:forEach>

</body>
</html>