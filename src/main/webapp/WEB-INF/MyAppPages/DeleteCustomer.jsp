<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleting a Customer</title>
</head>
<body>
	<h1 style="text-align:center;width:100%">Delete a Customer based on ID</h1>
	<hr/>
	<h3 style="text-align:center;width:100%"><a href="/myapp">Home</a></h3>
	<hr/>
	<p style="text-align:center;width:100%">
		<form style="text-align:center;width:100% "name="frmDelete" method="POST" action="deleteCustomer">
			Customer ID: <input type="text" name="txtSearch" placeholder="Enter Customer ID to delete">
			<input type="submit" value="Delete" /> 
		</form>
	<h2 style="text-align:center; width:100%">${msg }</h2>
</body>
</html>