<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Renter Form Handling</title>
</head>
<body>
<h2>Renter Registration Form</h2>
<mvc:form modelAttribute="renter" action="result.mvc">
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
	        <td><mvc:password path="age" /></td>
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
            <td><mvc:input path="state" /></td>
        </tr>
        <tr>
            <td><mvc:label path="zip">Zip</mvc:label></td>
            <td><mvc:input path="zip" /></td>
        </tr>
        
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Renters</a>

</body>
</html>