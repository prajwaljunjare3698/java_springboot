<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Taglib directives</h1>
	<p:set var="name" value="TechSoft India"></p:set>
	
	<h2> <p:out value="${name}"></p:out> </h2>
	
	<p:if test="${6>3}">
		<h3>6>4 is true</h3>
	</p:if>
	
	<p:out value="${2+5 }"></p:out>
	
</body>
</html>