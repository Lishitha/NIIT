package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;



//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;


public class UserController {

	@Autowired
	UserDAO userDAO;

	/*@Autowired
	UserDetails userDetails;*/

	@Autowired
	User user;

	/*@RequestMapping("/login_to_enter1")
	public ModelAndView loginToEnter(@RequestParam(value="userName") String userID,
			@RequestParam(value="pwd") String password,HttpSession session){
		
		
		ModelAndView mv = new ModelAndView("Home");
		
		/*String message;
		if(name.equals("LISHI") && password.equals("LISHI"))
		{
			message="YOU ARE SUCCESSFULLY LOGGED IN";
		}
		else
		{
			message="SORRY.... YOU ARE FAILED";
		}
		mv.addObject("msg", message);*/
		
		/*boolean isValidUser = userDAO.isValidUser(userID, password, false);
		System.out.println(isValidUser);
	
			if (isValidUser == true) {
				
				user = userDAO.get(userID);
//				session.setAttribute("loggedInUser", user.getName());
				System.out.println(user.getId()+"logged in");
				
				
				}
			
			else{
				mv.addObject("invalidCredentials", "true");
				mv.addObject("errorMsg","Invalid Credentials");
			}

	return mv;
}*/

}
