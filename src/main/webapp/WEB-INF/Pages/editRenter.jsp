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
<img src="https://www.rentcar.pl/blog/wp-content/uploads/2014/12/RentCar.pl-10-tips.png">
	<h2>Edit Renter</h2>
	<mvc:form modelAttribute="renter" action="renterEditResult.mvc">
 
		First Name: <input 
			type="text" name="firstName"
			value="${renterToEdit.firstName }"> 
		 Last Name: <input 
			type="text" name="lastName"
			value="${renterToEdit.lastName }">
		Age: <input 
			type="text" name="age"
			value="${renterToEdit.age }">
		 Employer: <input 
			type="text" name="insuranceCompany"
			value="${renterToEdit.insuranceCompany }">
		 Income: <input 
			type="text" name="phoneNumber"
			value="${renterToEdit.phoneNumber }">
			
		Phone Number: <input 
			type="text" name="address"
			value="${renterToEdit.address }">
			
		<input type="hidden"
			name="renterId" value="${renterToEdit.renterId }">
		 <input type="submit" value="Save Edited renter">
	</mvc:form>
	<a href="viewAllRenters.mvc">View all Renters</a>
	<a href="home.mvc">Back to main menu</a>
</body>
</html>