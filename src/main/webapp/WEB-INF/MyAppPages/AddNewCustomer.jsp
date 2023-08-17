<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customers</title>
</head>
<body>
	<h1 style="text-align:center;width:100%">Add New Customer for PhoneBook</h1>
	<hr/>
	<h3 style="text-align:center;width:100%"><a href="/myapp">Home</a></h3>
	<hr/>
	<form style="text-align:center;width:100%" name="frmReg" method="POST" action="addnewcustomer">
	<p style="text-align:center;width:100%">
		<input type="text" name="txtPname" placeholder="Person Name" required />
		<br/><br/>
		<input type="text" name="txtPhone" placeholder="Person Number" required />
		<br/><br/>
		<input type="email" name="txtEmail" placeholder="Email" required />
		<br/><br/>
		<input type="Submit" value="Add New Customer"  />
		<br/><br/>
		<h2>${msg }</h2>
	</p>
	</form>
</body>
</html> 