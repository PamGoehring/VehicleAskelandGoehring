<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Vehicles</title>
</head>
<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Vehicle Type</td>
				<td>${item.vehicleType}</td>
			</tr>
			<tr>
				<td>Make</td>
				<td>${item.make}</td>
			</tr>
			<tr>
				<td>Model</td>
				<td>${item.model}</td>
			</tr>
			<tr>
				<td>Cost</td>
				<td>${item.cost}</td>
			</tr>
			<tr>
				<td>Number of Passengers</td>
				<td>${item.numberOfPassengers}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="vehicleForm.mvc">Add a new vehicle</a>
</body>
</html>