<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Entered</title>
</head>
<body>
	<h2>Vehicle Registration Result</h2>
	<table>
		<tr>
			<td>Vehicle Type</td>
			<td>${v.vehicleType}</td>
		</tr>
		<tr>
			<td>Make</td>
			<td>${v.make}</td>
		</tr>
		<tr>
			<td>Model</td>
			<td>${v.model}</td>
		</tr>
		<tr>
			<td>Cost</td>
			<td>${v.cost}</td>
		</tr>
		<tr>
			<td>Number of Passengers</td>
			<td>${v.numberOfPassengers}</td>
		</tr>
	</table>
<a href="viewAllVehicles.mvc">View all Vehicles</a>
</body>
</html>