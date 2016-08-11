package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController {

	@Autowired
	private Category category;

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	User user;

	@Autowired
	UserDAO userDAO;
	

	/*
	 * @Autowired UserDetails userDetails;
	 */

	@RequestMapping("/")
	public ModelAndView myfun1(HttpSession session) {
		ModelAndView mv = new ModelAndView("/Home");
		
		 session.setAttribute("category", category);
		 session.setAttribute("categoryList", categoryDAO.list());
		 return mv;

	}
	
	//TO EDIT CATEGORY
	

	@RequestMapping("/login")
	public ModelAndView Login() {
		ModelAndView mv = new ModelAndView("/Home");

		mv.addObject("user", user);
		mv.addObject("isUserClickedLogin", "true");
		return mv;

	}

	@RequestMapping("/register")
	public ModelAndView Register() {
		ModelAndView mv = new ModelAndView("/Home");

		mv.addObject("user", user);
		mv.addObject("isUserClickedRegister", "true");

		return mv;
	}

	@RequestMapping(value = "here/register", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user) {
		userDAO.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("successMessage", "You are successfully register");

		return mv;
	}

	@RequestMapping(value = "/login_to_enter", method = RequestMethod.POST)
	public ModelAndView loginToEnter(@RequestParam(value = "userName") String userID,
			@RequestParam(value = "pwd") String password, HttpSession session) {

		ModelAndView mv = new ModelAndView("/Home");
		boolean isValidUser = userDAO.isValidUser(userID, password, false);
		System.out.println(isValidUser);

		if (isValidUser == true) {

			user = userDAO.get(userID);
			session.setAttribute("loggedInUser", user.getName());
			System.out.println(user.getId() + "logged in");

			if (userID.equals("LISHI") && password.equals("LISHI")) {
				mv.addObject("isAdmin", "true");

			} else {
				mv.addObject("isAdmin", "false");

			}
		}

		else {
			mv.addObject("invalidCredentials", "true");
			mv.addObject("errorMsg", "Invalid Credentials");
		}
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView("/Home");

		// Once a session has been invalidated, the SessionID placed in a cookie
		// on the client will be invalid too, and a new one will have to be
		// created when a new session object is created. So the new Session will
		// have a new ID.
		session.invalidate();

		// request.getSession(true) will return current session. If current
		// session will not exist then it will create new session.
		session = request.getSession(true);
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDAO.list());

		mv.addObject("logoutMsg", "...YOU ARE SUCCESSFULLY LOGGED OUT...");
		mv.addObject("loggedOut", "true");
		return mv;
	}
	
	

}
