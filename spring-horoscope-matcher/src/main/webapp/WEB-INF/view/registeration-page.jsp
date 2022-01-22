<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<h1>working</h1>
	<form:form action="registerationSuccess" method ="GET" modelAttribute="userDto1">

		<label>User:</label>
		<form:input path="name" />

		<br>

		<label>UserName:</label>
		<form:input path="username" />
		<br>

		<label>Password:</label>
		<form:password path="password" />


		<br>

		<label>Country Name:</label>
		<form:select path="countryname">

			<form:option value="India"></form:option>
			<form:option value="bhutan"></form:option>
			<form:option value="ameri"></form:option>
			<form:option value="Bangla"></form:option>
			<form:option value="Srilanka"></form:option>
			<form:option value="Pakistan"></form:option>

		</form:select>
		
		
		<br>
		<label>Hobbies: </label>
		
		Cricket<form:checkbox path="hobbies" value="cricket"/>
		songs<form:checkbox path="hobbies" value="songs"/>
		game<form:checkbox path="hobbies" value="game"/>
		movies<form:checkbox path="hobbies" value="movies"/>
		
		
		<br>
		<label>Gender: </label>
		
		male<form:radiobutton path="gender" value="male"/>
		
		female<form:radiobutton path="gender" value="female"/>
		
		
		<br>
		<input type="submit" value="register">
		
	</form:form>
</div>
</body>
</html>