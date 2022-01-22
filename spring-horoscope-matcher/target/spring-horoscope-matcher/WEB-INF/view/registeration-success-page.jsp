<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hola</h1>

	Name: ${userDto1.name}
	<br> UserName: ${userDto1.username}
	<br> pwd: ${userDto1.password}
	<br> country: ${userDto1.countryname}
	<c:forEach var="temp" items="${userDto1.hobbies}">
	${temp}
	</c:forEach>
	
	
	
	<br> gender: ${userDto1.gender}
</body>
</html>