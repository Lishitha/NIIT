<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body  background="C:\Users\LISHITHA K A\workspace\ShoppingCartFrontEnd1\src\main\webapp\WEB-INF\images\Website-Background.png" style="background-color:#E8DAEF;">



	<H1 style="text-align: center; font-size: 200%; font-family: verdana; color: #FFFFFF">LOGIN</H1>
    
    
		<c:url var="action" value="/login_to_enter" ></c:url>
	    <form:form action="${action}" method="post" style="color: #FFFFFF">
		
			<table align="center">
				<tr>
					<td> <input type="text" name="userName" autofocus
						required id="userName" placeholder="Enter your Name"
						title="Enter a valid user name">
					</td>
				</tr>

				<tr>
					<td><input type="password" name="pwd" autofocus
						required id="pwd" placeholder="Enter passWord"
						title="Enter a secure password">
					</td>
				</tr>
				
				<tr>
				<td>
				<input type="submit" value="Log In">
				</td>
				</tr>
			</table>
		</form:form>
	

</body>

</html>

