<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addCarPart.lti" method="post">
		PartNo: <input type="text" name="partNo"/> <br />
		Name <input type="text" name="name"/> <br />
		carModel: <input type="text" name="carModel"/> <br />
		price: <input type="text" name="price"/> <br />
		quantity: <input type="text" name="quantity"/> <br />
		<button type="submit">add</button>
	</form>
<h3></h3>
</body>
</html>