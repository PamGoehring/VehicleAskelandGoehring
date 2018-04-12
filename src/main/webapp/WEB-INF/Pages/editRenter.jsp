<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Renter</title>
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
	<img
		src="https://www.rentcar.pl/blog/wp-content/uploads/2014/12/RentCar.pl-10-tips.png">
	<h2>Edit Renter</h2>
	<mvc:form modelAttribute="renter" action="renterEditResult.mvc">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"
					value="${renterToEdit.firstName}"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"
					value="${renterToEdit.lastName}"></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age" value="${renterToEdit.age}"></td>
			</tr>
			<tr>
				<td>Insurance Company:</td>
				<td><input type="text" name="insuranceCompany"
					value="${renterToEdit.insuranceCompany}"></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phoneNumber"
					value="${renterToEdit.phoneNumber}"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address"
					value="${renterToEdit.address}"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" value="${renterToEdit.city}"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="state"
					value="${renterToEdit.state}"></td>
			</tr>
			<tr>
				<td>Zip:</td>
				<td><input type="text" name="zip" value="${renterToEdit.zip}"></td>
			</tr>
			<tr>
				<td>Vehicle ID:</td>
				<td><input type="text" name="vehicleId"
					value="${renterToEdit.vehicleId}"></td>
			</tr>

		</table>
		<br />
		<input type="hidden" name="renterId" value="${renterToEdit.renterId }">
		<input type="submit" value="Save Edited renter">
	</mvc:form>
	<a href="viewAllRenters.mvc">View all Renters</a>
	<a href="home.mvc">Back to main menu</a>
</body>
</html>