<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>
	<h2>ADD PRODUCT</h2>

	<c:url var="addProduct" value="to_add_product"></c:url>
	<form:form action="${addProduct}" commandName="product">

	<table>
		<tr>
			<td><form:label path="id">
					<spring:message text="ProductID" />
				</form:label></td>
			<c:choose>

				<c:when test="${!empty product.id}">
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
					<spring:message text="ProductName"></spring:message>
				</form:label></td>
			<td><form:input path="name" required="true"></form:input></td>
		</tr>

		<tr>
			<td><form:label path="description">
					<spring:message text="ProductDescription"></spring:message>
				</form:label></td>
			<td><form:input path="description" required="true"></form:input></td>
		</tr>

		<tr>
			<td><form:label path="price">
					<spring:message text="ProductPrice"></spring:message>
				</form:label></td>
			<td><form:input path="description" required="true"></form:input></td>
		</tr>
	</table>
	</form:form>
	
	<h2>LIST OF PRODUCTS</h2>
	<c:if test="${!empty productList}">
	<table>
	<tr>
				<th> ID</th>
				<th> NAME</th>
				<th> DESCRIPTION</th>
				<th> PRICE</th>
				<th> CATEGORY</th>
				<th> SUPPLIER</th>
				<th> EDIT</th>
				<th> DELETE</th>
			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.category.name}</td>
					<td>${product.supplier.name}</td>
					<td><a href="<c:url value='product/edit/${product.id}' />">Edit</a></td>
					<td><a href="<c:url value='product/remove/${product.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
	
	</table>
	</c:if>
	
</body>
</html>