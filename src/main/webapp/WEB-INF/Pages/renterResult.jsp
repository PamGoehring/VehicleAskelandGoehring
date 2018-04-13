<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renter Entered</title>
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
	<h2>Renter Registration Result</h2>
	<table>
		<tr>
			<td>First Name</td>
			<td>${r.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${r.lastName}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${r.age}</td>
		</tr>
		<tr>
			<td>Insurance Company</td>
			<td>${r.insuranceCompany}</td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td>${r.phoneNumber}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${r.address}</td>
		</tr>
		<tr>
			<td>City</td>
			<td>${r.city}</td>
		</tr>
		<tr>
			<td>State</td>
			<td>${r.state}</td>
		</tr>
		<tr>
			<td>Zip</td>
			<td>${r.zip}</td>
		</tr>
		<tr>
			<td>Vehicle Id</td>
			<td>${r.vehicleId}</td>
		</tr>
	</table>
	<br />
	<a href="viewAllRenters.mvc">View all Renters</a>
</body>
</html>