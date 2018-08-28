<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Task List</title>
</head>
<body>
<div class="container">
	<h2>Task List</h2>
	<table border="1">
		<thead>
			<tr>
				<th>IdEmail</th>
				<th>Description</th>
				<th>DueDate</th>
				<th>Complete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="task" items="${task }">
				<tr>
					<td>${task.idemail }</td>
					<td>${task.description }</td>
					<td>${task.duedate }</td>
					<td>${task.complete }</td>
					<td><a href="delete?id=${task.id }" >Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>