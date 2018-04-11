<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Renters</title>
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
	<h2>View All Renters</h2>
	<mvc:form modelAttribute="renter" action="renterUpdate.mvc">
		<table>
			<tr>
				<th>Renter Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Insurance Company</th>
				<th>Phone Number</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Zip</th>

			</tr>
			<c:forEach items="${all}" var="item">
				<tr>
					<td><input type="radio" name="renterId"
						value="${item.renterId}"></td>

					<td>${item.firstName}</td>

					<td>${item.lastName}</td>

					<td>${item.age}</td>

					<td>${item.insuranceCompany}</td>

					<td>${item.phoneNumber}</td>

					<td>${item.address}</td>

					<td>${item.city}</td>

					<td>${item.state}</td>

					<td>${item.zip}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<input type="submit" value="Edit Selected Renter"
			name="doThisToRenter">
		<input type="submit" value="Delete Selected Renter"
			name="doThisToRenter">
	</mvc:form>
	<br />
	<a href="form.mvc">Add New Renter</a>
	<br />
	<a href="home.mvc">Back To Main Menu</a>
	<br />
</body>
</html>