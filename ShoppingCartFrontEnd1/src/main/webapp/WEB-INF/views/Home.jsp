<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Shopping Cart</title>

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700'
	rel='stylesheet' type='text/css'>

<!-- font awesome -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css"
	href="C:\Users\LISHITHA K A\workspace\ShoppingCartFrontEnd1\src\main\webapp\WEB-INF\css\home.css">

</head>

<body
	background="C:\Users\LISHITHA K A\workspace\ShoppingCartFrontEnd1\src\main\webapp\WEB-INF\images\Website-Background.png"
	style="background-color: #E8DAEF;">
	<H1
		style="text-align: center; font-size: 400%; font-family: verdana; color: #FFFFFF">
		SHOPPING CART</H1>




	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
				<li><a href="#">About Us</a></li>
			</ul>

			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>


			<ul class="nav navbar-nav navbar-right">

				<li><a href="#">Log In</a></li>
				<li><a href="#">Register</a></li>
			</ul>


		</div>

	</div>
	</nav>



	<table width="100%">
		<tr>

			<c:choose>
				<c:when test="${empty loggedInUser }">

					<td align="left"><a href="login"
						style="textfont-size: 200%; font-family: verdana; color: #FFFFFF">Login</a></td>

					<td align="right"><a href="register"
						style="textfont-size: 200%; font-family: verdana; color: #FFFFFF">Register</a></td>

				</c:when>

				<c:when test="${not empty loggedInUser }">
					<td align="center" style="textfont-size: 300%; font-family: verdana; color: #FFFFFF">WELCOME ${loggedInUser }</td>
					<td align="right"><a href="logout"
						style="textfont-size: 200%; font-family: verdana; color: #FFFFFF">LogOut</a></td>
				</c:when>

			</c:choose>

		</tr>
	</table>


	<div id="logout">
		<c:if test="${loggedOut==true}">
			<td align="center" style="textfont-size: 300%; font-family: verdana; color: #FFFFFF">${logoutMsg}</td>
		</c:if>
	</div>



	<div id="login">
		<c:if test="${isUserClickedLogin==true || invalidCredentials==true}">
			<div id="error">${errorMsg}</div>
			<td>${msg}</td>
			<%@ include file="Login.jsp"%>

		</c:if>
	</div>

	<div id="register">
		<c:if test="${isUserClickedRegister==true}">
			<%@ include file="Register.jsp"%>

		</c:if>
	</div>

	<div id="isAdmin">
		<c:if test="${isAdmin==true }">
			<%@ include file="Isadmin.jsp"%>
		</c:if>
	</div>

	<div id="category">
		<c:if test="${isAdminCLickedCategory==true }">
			<%@ include file="Category.jsp"%>
		</c:if>
	</div>

	<div id="product">
		<c:if test="${isAdminClickedProduct==true }">
			<%@ include file="Product.jsp"%>
		</c:if>
	</div>

	<div id="supplier">
		<c:if test="${isAdminClickedSupplier==true }">
			<%@ include file="Supplier.jsp"%>
		</c:if>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</body>
</html>




