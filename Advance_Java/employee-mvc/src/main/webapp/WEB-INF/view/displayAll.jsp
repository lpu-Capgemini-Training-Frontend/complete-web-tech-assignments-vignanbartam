<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	isELIgnored="false"
	%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1>Id:${id}</h1>
<h1>Name:${name}</h1>
<h1>Phone:${phone}</h1> --%>

	<table border = "3">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="e" items="${list}">
			<tr>
				<td>${e.id}</td>
				<td>${e.name}</td>
				<td>${e.phone}</td>
				<td>${e.email}</td>
				<td><a href="edit?id=${e.id}">Update</a></td>
				<td><a href="delete?id=${e.id}">Delete</a></td>
			</tr>


		</c:forEach>


	</table>

</body>
</html>