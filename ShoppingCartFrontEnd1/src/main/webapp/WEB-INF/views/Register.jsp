<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\LISHITHA K A\workspace\ShoppingCartFrontEnd1\src\main\webapp\WEB-INF\images\Website-Background.png" style="background-color:#E8DAEF;">>

<H1 style="text-align: center; font-size: 200%; font-family: verdana; color: #FFFFFF">REGISTER</H1>

	<div id="box">
	
	     <c:url var="action" value="/here/register"></c:url>
	     <!--  to use the form to submit the data - modelAttribute  -->
		 <form:form action="${action}" method="post" modelAttribute="user">
		 
			<table align="center">
				<tr>
					<td> <input type="text" name="id" autofocus required id="id" 
            placeholder="Id" title="Enter Id">
					</td>
				</tr>

				<tr>
					<td><input type="text" name="name" autofocus required id="userName" 
            placeholder="Enter your Name" title="Enter a valid user name">
					</td>
				</tr>
				
				<tr>
					<td><input type="password" name="password" autofocus required id="pwd" 
            placeholder="Enter passWord" title="Enter a secure password">
					</td>
				</tr>
				
				
				<tr>
				<td><input type="number" name="contactNumber" autofocus required id="moblieNumber" 
            placeholder="Mobile Number" title="Enter Your Mobile Number">
					</td>
				</tr>
				
				<tr>
				<td><input type="email" name="mailID" autofocus required id="userEmail" 
            placeholder="E-Mail Id" title="Enter a Your Mail Id">
					</td>
				</tr>
				
				<tr>
				<td><input type="text" name="address" autofocus required id="userAddress" 
            placeholder="Address" title="Enter Your Address">
					</td>
				</tr>
				
				<tr>
				<td>
				<input type="submit" value="Register">
				</td>
				</tr>
				
				
				
			</table>
		</form:form>
	</div>
</body>
</html>



