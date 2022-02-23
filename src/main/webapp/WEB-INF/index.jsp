<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Fruity Loops</title>
	<link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>
	<h1>Fruit Store</h1>
	<table class="main-table">
		<thead>
			<tr>
				<td>Name</td>
				<td>Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="fruit" items="${frutas}">
				<tr>
					<td><p><c:out value="${fruit.name}"/></p></td>
					<td><p><c:out value="${fruit.price}"></c:out></p></td>	
				</tr>	
			</c:forEach>
		</tbody>
	</table>

</body>
</html>