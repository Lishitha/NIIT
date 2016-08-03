<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Shopping Cart</title>
</head>

<body
	background="C:\Users\LISHITHA K A\workspace\ShoppingCartFrontEnd1\src\main\webapp\WEB-INF\images\Website-Background.png"
	style="background-color: #E8DAEF;">
	<H1
		style="text-align: center; font-size: 400%; font-family: verdana; color: #FFFFFF">
		SHOPPING CART</H1>
		
		

	<table width="100%">
		<tr>
		
				
					<td align="left" ><a href="login"
						style="textfont-size: 200%; font-family: verdana; color: #FFFFFF">Login</a></td>
						
					<td align="right" ><a href="register"
						style="textfont-size: 200%; font-family: verdana; color: #FFFFFF">Register</a></td>
						
			
		</tr>
	</table>
	
	<div id="login">
		<c:if
			test="${isUserClickedLogin==true || invalidCredentials==true}">
			<div id="error">${errorMessage}</div>
			<%@ include file="Login.jsp"%>

		</c:if>
	</div>

	<div id="register">
		<c:if test="${isUserClickedRegister==true}">
			<%@ include file="Register.jsp"%>

		</c:if>
	</div>
	

</body>
</html>




