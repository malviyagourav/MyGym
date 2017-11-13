<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
 <div class="row">
	<div class="col-md-12">
		<h1>Registration List</h1>
		
		<table class="table">
<tr>
			<th class="warning">NAME</th>
			<th class="warning">MOBILE</th>
			<th class="warning">Address</th>
			<th class="warning">FEES</th>
			<!-- <th class="warning">Edit</th>
			<th class="warning">Delete</th> -->
			
</tr>
			<c:forEach var="employee" items="${msg}">
				<tr class="success">

					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.mobile}</td>
					<td>${employee.address}</td>
					<td>${employee.fees}</td>
					<%-- <td><a class="btn btn-primary" href="editEmployee?id=${employee.id}" >Edit</a></td>
						<td> <a class="btn btn-warning" href="deleteEmployee?id=${employee.id}">Delete</a></td>
 --%>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="regview">
			<button>here</button></a>
			<input type ="button" value="show">
		</h4>
	</div>
	</div>
	</div>
	
</body>
</html>
