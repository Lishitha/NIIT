package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.model.UserDetails;

public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User userDetails;
	
	@RequestMapping("/login_to_enter")
	public ModelAndView loginToEnter(@RequestParam(value="userName") String name,
			@RequestParam(value="pwd") String password,HttpSession session){
		ModelAndView mv = new ModelAndView("/exmpl");
		
		String message;
		if(name.equals("LISHI") && password.equals("LISHI"))
		{
			message="YOU ARE SUCCESSFULLY LOGGED IN";
		}
		else
		{
			message="SORRY.... YOU ARE FAILED";
		}
		mv.addObject("msg", message);
		
		boolean isValidUser = userDAO.isValidUser(name,password,isValidUser);
		
		if(isValidUser==true){
			userDetails=userDAO.get(name);
			session.setAttribute("loggedInUser", userDetails.getId());
		
		}
		
		/*boolean isValidUser = userDAO.isValidUser(userID, password, isValidUser);

		if (isValidUser == true) {
			userDetails = userDAO.get(userID);
			session.setAttribute("loggedInUser", userDetails.getName());
			if (userDetails.getAdmin() == 1) {
				mv.addObject("isAdmin", "true");

			} else {
				mv.addObject("isAdmin", "false");
				cart = cartDAO.get(userID);
				mv.addObject("cart", cart);
				List<Cart> cartList = cartDAO.list();
				mv.addObject("cartList", cartList);
				mv.addObject("cartSize", cartList.size());
			}

		} else {

			mv.addObject("invalidCredentials", "true");
			mv.addObject("errorMessage", "Invalid Credentials");
			

		}
		log.debug("Ending of the method login");
		return mv;
	}*/
		
		return mv;
	}
 
}


