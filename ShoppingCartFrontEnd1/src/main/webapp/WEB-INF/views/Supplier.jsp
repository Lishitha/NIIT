<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>supplier</title>
</head>
<body>
	<h2 style="text-align: center; font-family: verdana; color: #FFFFFF">ADD
		SUPPLIER</h2>
	<c:url var="addSupplier" value="to_add_supplier"></c:url>
	<form:form action="${addSupplier }" commandName="supplier">

		<table align="center">
			<tr>
				<td style="font-family: verdana; color: #FFFFFF"><form:label
						path="id">
						<spring:message text="SupplierID" />
					</form:label></td>
				<c:choose>

					<c:when test="${!empty supplier.id}">
						<td><form:input path="id" disabled="true" readonly="true" />
						</td>
					</c:when>

					<c:otherwise>
						<td><form:input path="id" pattern=".{5,7}" required="true"
								title="Enter a valid id" /></td>
					</c:otherwise>
				</c:choose>
			</tr>

			<tr>
				<td style="font-family: verdana; color: #FFFFFF"><form:label
						path="name">
						<spring:message text="SupplierName"></spring:message>
					</form:label></td>
				<td><form:input path="name" required="true"></form:input></td>
			</tr>

			<tr>
				<td style="font-family: verdana; color: #FFFFFF"><form:label
						path="address">
						<spring:message text="SuppqlierAddress"></spring:message>
					</form:label></td>
				<td><form:input path="address" required="true"></form:input></td>
			</tr>

			<tr>
				<!-- if the category is already exist, then edit -->
				<td colspan="2" align="center"><c:if test="${!empty supplier.name }">
						<input type="submit"
							value="<spring:message text="Edit"></spring:message>">
					</c:if> <c:if test="${empty supplier.name}">
						<input type="submit"
							value="<spring:message text="Add"></spring:message>">
					</c:if></td>
			</tr>
		</table>
	</form:form>

	<h2 style="font-family: verdana; color: #FFFFFF; text-align: center">LIST
		OF SUPPLIERS</h2>
	<c:if test="${!empty supplierList}">
		<table align="center">
			<tr>
				<th style="font-family: verdana; color: #FFFFFF">ID</th>
				<th style="font-family: verdana; color: #FFFFFF">NAME</th>
				<th style="font-family: verdana; color: #FFFFFF">ADDRESS</th>
				<th style="font-family: verdana; color: #FFFFFF">EDIT</th>
				<th style="font-family: verdana; color: #FFFFFF">DELETE</th>
			</tr>

			<c:forEach items="${supplierList }" var="supplier">
				<tr>
					<td style="font-family: verdana; color: #FFFFFF">${supplier.id}</td>
					<td style="font-family: verdana; color: #FFFFFF">${supplier.name}</td>
					<td style="font-family: verdana; color: #FFFFFF">${supplier.address}</td>
					<td style="font-family: verdana; color: #FFFFFF"><a
						href="<c:url value='supplier/edit/${supplier.id}' />">Edit</a></td>
					<td style="font-family: verdana; color: #FFFFFF"><a
						href="<c:url value='supplier/remove/${supplier.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>