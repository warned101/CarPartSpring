<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Content</title>
</head>
<body>
	<h1>Hello</h1>
	<c:forEach items="${ listOfCarParts }" var="c">
	<tr>
		<td>${ c.partNo }</td>
		<td>${ c.name }</td>
		<td>${ c.carModel }</td>
		<td>${ c.price }</td>
		<td>${ c.quantity }</td>
	</tr>
	 </c:forEach>
</body>
</html>