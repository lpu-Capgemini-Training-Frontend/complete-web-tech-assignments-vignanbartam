<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="id" value="${e.id}">
Name:<input name="name" value="${e.name}"> <br>
Phone:<input name="Phone" value="${e.phone}"> <br>
Email:<input name="Email" value="${e.email}"> <br>
<input type="submit" value="Update">
</form>
</body>
</html>