<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h2> Create New Account</h2>
<form name="AccountForm" method="post" action="saveAccount">
<table>

<tr><td>Account No</td>
<td><input type="text" name="accountNo" /> </td>
</tr>
<tr><td>Account Name</td>
<td><input type="text" name="accountHolderName" /> </td>
</tr>
<tr><td>Account balance</td>
<td><input type="text" name="balance" /> </td>
</tr>

<tr><td colspan="2" align="center">
<td><input type="submit" value="Create Account" name="btnSubmit"/> </td>
</tr>

</table>
</form>
</body>
</html>