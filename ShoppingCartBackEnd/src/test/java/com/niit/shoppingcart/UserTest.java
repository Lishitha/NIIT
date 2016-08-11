package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		UserDAO userDAO = (UserDAO) con.getBean("userDAO");
		
		User user= (User) con.getBean("user");
		
		user.setId("US01");
		user.setName("LEENA");
		user.setPassword("LEENA");
		user.setMailID("leena@gmail.com");
		user.setAddress("DUBAI");
		user.setContactNumber("98452366");
		
		user.setAdmin(true);
		
		userDAO.saveOrUpdate(user);
		
		/*if(userDAO.get("sdfghg")==null)
		{
			System.out.println("not exist");
		}
		else
		{
			System.out.println("exist");
			System.out.println();
			
		}*/

	}

}
