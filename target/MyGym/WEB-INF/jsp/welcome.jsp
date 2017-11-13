<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
register ${msg}
<form action="register.html" method="POST" modelAttribute="welcome">
<table>
<thead><tr><td>Enquiry form</td></tr></thead>
<tbody>
<tr>
<td>Name : </td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" ></td>
</tr>
<tr>
<td>address</td>
<td><input type="text" name="address" ></td>
</tr>
<tr>
<td>fees</td>
<td><input type="text" name="fees" ></td>
</tr>
<td><input type="submit" ></td>
</tr>
</tbody>
</table>
</form>
</body>
</html>