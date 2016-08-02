package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.UserDetails;


public class UserDetailsTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		UserDAO userDAO = (UserDAO) con.getBean("userDAO");
		
		UserDetails userDetails= (UserDetails) con.getBean("userDetails");
		
		userDetails.setId("SUP03");
		userDetails.setName("SREE");
		userDetails.setMailID("sree@gmail.com");
		userDetails.setAddress("SHJ");
		userDetails.setContactNumber(957384273);
		
		
		userDAO.saveOrUpdate(userDetails);

	}

}
