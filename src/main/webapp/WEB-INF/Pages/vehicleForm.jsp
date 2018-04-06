<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Vehicle Form</title>
</head>
<body>
	<h2>Vehicle Form</h2>
	<mvc:form modelAttribute="vehicle" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="vehicleType">Vehicle Type</mvc:label></td>
				<td><mvc:input path="vehicleType" /></td>
			</tr>
			<tr>
				<td><mvc:label path="cost">Cost</mvc:label></td>
				<td><mvc:input path="cost" /></td>
			</tr>
			<tr>
				<td><mvc:label path="numberOfPassengers">Number of Passengers</mvc:label></td>
				<td><mvc:input path="numberOfPassengers" /></td>
			</tr>
			<tr>
				<td><mvc:label path="make">Make</mvc:label></td>
				<td><mvc:input path="make" /></td>
			</tr>
			<tr>
				<td><mvc:label path="model">Model</mvc:label></td>
				<td><mvc:input path="model" /></td>
			</tr>

		</table>
	</mvc:form>
	<a href="viewAll.mvc">View All Vehicles</a>
</body>
</html>