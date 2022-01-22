<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1 align="center"> Horoscope Matcher</h1>

	<form:form action="process-homepage" method="get" modelAttribute="userinfo">
		
		<div align="center">
			<p>
			<label for ="yn"> your name:</label>
			<form:input id="yn" path="userName"/>
			<form:errors path="userName"></form:errors>
			</p>
			
			<p>
			<label for ="pn"> partner name:</label>
			<form:input id="pn" path="partnerName"/>
		    </p>
		    
			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>