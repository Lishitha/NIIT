<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>ADD CATEGORY</h2>
	<c:url var="addSupplier" value="to_add_supplier"></c:url>
	<form:form action="${addSupplier }" commandName="supplier">

		<table>
			<tr>
				<td><form:label path="id">
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
				<td><form:label path="name">
						<spring:message text="SupplierName"></spring:message>
					</form:label></td>
				<td><form:input path="name" required="true"></form:input></td>
			</tr>

			<tr>
				<td><form:label path="address">
						<spring:message text="SuppqlierAddress"></spring:message>
					</form:label></td>
				<td><form:input path="address" required="true"></form:input></td>
			</tr>
</table>
</form:form>
</body>
</html>