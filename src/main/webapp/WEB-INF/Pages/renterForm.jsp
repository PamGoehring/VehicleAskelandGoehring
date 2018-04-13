<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Renter Form Handling</title>
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
	<h2>Add Renter Information</h2>
	<mvc:form modelAttribute="renter" action="renterResult.mvc">
		<table>
			<tr>
				<td><mvc:label path="firstName">First Name</mvc:label></td>
				<td><mvc:input path="firstName" /></td>
			</tr>
			<tr>
				<td><mvc:label path="lastName">Last Name</mvc:label></td>
				<td><mvc:input path="lastName" /></td>
			</tr>
			<tr>
				<td><mvc:label path="age">Age</mvc:label></td>
				<td><mvc:input path="age" /></td>
			</tr>
			<tr>
				<td><mvc:label path="insuranceCompany">Insurance Company</mvc:label></td>
				<td><mvc:textarea path="insuranceCompany" /></td>
			</tr>
			<tr>
				<td><mvc:label path="phoneNumber">Phone Number</mvc:label></td>
				<td><mvc:input path="phoneNumber" /></td>
			</tr>
			<tr>
				<td><mvc:label path="address">Street Address</mvc:label></td>
				<td><mvc:input path="address" /></td>
			</tr>
			<tr>
				<td><mvc:label path="city">City</mvc:label></td>
				<td><mvc:input path="city" /></td>
			</tr>
			<tr>
				<td><mvc:label path="state">State</mvc:label></td>
				<td><mvc:select path="state" items="${states}" /></td>
				<%--             <td><mvc:input path="state" /></td> --%>
			</tr>
			<tr>
				<td><mvc:label path="zip">Zip</mvc:label></td>
				<td><mvc:input path="zip" /></td>
			</tr>
			<tr>
				<td><mvc:label path="vehicleId">Vehicle ID</mvc:label></td>
				<td><mvc:select name="vehicleId" path="vehicleId" items="${allVehicles}" itemLabel="vehicleId" itemValue="vehicleId" /></td>
				<%-- 				<td><mvc:input path="vehicleId" /></td> --%>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
	<a href="viewAllRenters.mvc">View All Renters</a>
</body>
</html>