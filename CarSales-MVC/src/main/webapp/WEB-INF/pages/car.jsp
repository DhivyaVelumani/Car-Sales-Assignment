<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customers</title>
<style>
table{
border:2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid blue;
}
</style>
</head>
<body>

<table>
	<tr>
		<th>Model</th>
		<th>ModelYr</th>
		<th>Travel KMs</th>
		<th>Status</th>
		<th>Owner name</th>
		<th>Owner Number</th>
		
	</tr>
	<c:forEach items="${list}" var="eachItem">
	<tr>
		<td><c:out value="${eachItem.model}"/></td>
		<td><c:out value="${eachItem.modelyrr}"/></td>
		<td><c:out value="${eachItem.travelKms}"/></td>
		<td><c:out value="${eachItem.status}"/></td>
		<td><c:out value="${eachItem.ownerName}"/></td>
		<td><c:out value="${eachItem.ownerNumber}"/></td>
  
	</tr>
	</c:forEach>
</table>
</body>
</html>
