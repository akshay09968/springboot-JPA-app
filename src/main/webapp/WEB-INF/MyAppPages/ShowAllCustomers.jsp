<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Details</title>
</head>
<body>
	<h1 style="text-align:center;width:100%">View All Customers</h1>
	<hr/>
	<h3 style="text-align:center;width:100%"><a href="/myapp">Home</a></h3>
	<hr/>
	<table width="100%" border="1" >
		<tr>
			<th>Customer ID</th>
			<th>Person Name</th>
			<th>Phone Number</th>
			<th>Email</th>
		</tr>
		<c:forEach var="pb" items="${vall}"> 
			<tr>
				<td>${pb.custID}</td>
				<td>${pb.pname}</td>
				<td>${pb.phone}</td>
				<td>${pb.email}</td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>