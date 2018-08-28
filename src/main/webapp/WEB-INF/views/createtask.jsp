<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add A New Task</title>
</head>
<body>
	<h3>Add A New Task</h3>

	<form action="/add" method="post">
		<br><br>Email Address: <br><input type="text" name="emailaddressid">
		<br><br>Description: <br><input type="text" name="description"> 
		<br><br>Due Date: <br><input type="text" name="duedate"> 
		<br><br>Complete <br><input type="checkbox" name="complete">
		<input type="submit" value="Submit"> 
	</form>

</body>
</html>

