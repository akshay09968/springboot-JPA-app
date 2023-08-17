<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updated customer</title>
</head>
<body>
	<h1 style="text-align:center;width:100%">Modification required fields</h1>
	<hr/>
	<h3 style="text-align:center;width:100%"><a href="/myapp">Home</a></h3>
	<hr/>
	<form name="frmReg" method="POST" action="updateinfo">
	<p style="text-align:center;width:100%">
		Customer ID: <input type="text" name="txtCid" value="${pinfo.custID }" readonly="readonly"/>
		<br/><br/>
		Customer Name: <input type="text" name="txtPname" value="${pinfo.pname }" />
		<br/><br/>
		Phone Number: <input type="text" name="txtPhone" value="${pinfo.phone }" />
		<br/><br/>
		Email: <input type="email" name="txtEmail" value="${pinfo.email }" />
		<br/><br/>
		<input type="Submit" value="Update Customer" />
		<br/><br/>
	</p>
		<h2 style="txt-align:center;width:100%">${msg }</h2>
	</form>
	
</body>
</html>