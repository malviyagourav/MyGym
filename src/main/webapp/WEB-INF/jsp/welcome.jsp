<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="save.html" method="post" modelAttribute="registration">
		<table class="table">
		<form:hidden path="id" /> 
			<tr>
				<td>Name:</td>
				<td><form:input path="name" class="form-control" /></td>
			</tr>
			<tr>
				<td>mobile:</td>
				<td><form:input path="mobile" class="form-control" /></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><form:input path="address" class="form-control" /></td>
			</tr>
			<tr>
				<td>fees:</td>
				<td><form:input path="fees" class="form-control" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					 class="btn btn-info"></td>
			</tr>
		</table>
	</form:form>
	<%-- <form:form action="register.html" method="POST"
		modelAttribute="welcome">
		<table>
			<thead>
				<tr>
					<td>Register form</td>
				</tr>
			</thead>
			<tbody>
				<form:hidden path="id" />
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" value=""></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>//
					<td>address</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>fees</td>
					<td><input type="text" name="fees"></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>
			</tbody>
		</table>
	</form:form> --%>
</body>
</html>