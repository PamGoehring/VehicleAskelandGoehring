<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Vehicle</title>
</head>
<body>
<img src="https://www.rentcar.pl/blog/wp-content/uploads/2014/12/RentCar.pl-10-tips.png">
	<h2>Edit Vehicle</h2>
	<mvc:form modelAttribute="vehicle" action="vehicleEditResult.mvc">
 
		Vehicle Type: <input 
			type="text" name="vehicleType"
			value="${vehicleToEdit.vehicleType}"> 
		Make: <input 
			type="text" name="make"
			value="${vehicleToEdit.make }">
		Model: <input 
			type="text" name="model"
			value="${vehicleToEdit.model }">
		Number of Passengers: <input 
			type="text" name="numberOfPassengers"
			value="${vehicleToEdit.numberOfPassengers }">
		Cost: <input 
			type="text" name="cost"
			value="${vehicleToEdit.cost }">
			
		<input type="hidden"
			name="vehicleId" value="${vehicleToEdit.vehicleId }">
		 <input type="submit" value="Save Edited vehicle">
	</mvc:form>
	<a href="viewAllVehicles.mvc">View all Vehicles</a>
	<a href="home.mvc">Back to main menu</a>
</body>
</html>