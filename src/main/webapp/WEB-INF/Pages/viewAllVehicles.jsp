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
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 60%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 4px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<img src="https://www.rentcar.pl/blog/wp-content/uploads/2014/12/RentCar.pl-10-tips.png">
<h2>All Available Vehicles</h2>
	<mvc:form modelAttribute="vehicle" action="vehicleUpdate.mvc">
		<table>
			<tr>
				<th>Selected</th>
				<th>Vehicle Type</th>
				<th>Make</th>
				<th>Model</th>
				<th>Cost</th>
				<th>Passengers</th>

			</tr>
			<c:forEach items="${all}" var="item">
				<tr>
					<td><input type="radio" name="vehicleId"
						value="${item.vehicleId}"></td>
					<td>${item.vehicleType}</td>

					<td>${item.make}</td>

					<td>${item.model}</td>

					<td>${item.cost}</td>

					<td>${item.numberOfPassengers}</td>

				</tr>


			</c:forEach>
		</table>
<br />
		<input type="submit" value="Edit Selected Vehicle"
			name="doThisToVehicle">
		<input type="submit" value="Delete Selected Vehicle"
			name="doThisToVehicle">
	</mvc:form>
	<br />
	<a href="vehicleForm.mvc">Add a new vehicle</a>
	<br />
	<a href="home.mvc">Back to main menu</a>
	<br />
</body>
</html>