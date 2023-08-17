<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify a customer</title>
</head>
<body>
	<h1 style="text-align:center;width:100%">Modify a Customer based on ID</h1>
	<hr/>
	<h3 style="text-align:center;width:100%"><a href="/myapp">Home</a></h3>
	<hr/>
	<p style="text-align:center;width:100%">
		<form style="text-align:center;width:100% "name="frmSearch" method="POST" action="getinfo">
			Customer ID: <input type="text" name="txtSearch" placeholder="Customer ID for Modification">
			<input type="submit" value="Search" /> 
		</form>
	</p>
		
	<h2 style="text-align:center; width:100%">${msg }</h2>

</body>
</html>