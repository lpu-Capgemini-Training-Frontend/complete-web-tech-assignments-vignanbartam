<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="save" modelAttribute="e">
Id:<form:input path="name" /> <br>
Name:<form:input path="name" /> <br>
Phone:<form:input path="phone" /> <br>
Email:<form:input path="email" /> <br>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>