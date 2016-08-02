package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;


@Controller
public class HomeController {
	
	@Autowired
	private Category category;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping("/")
	public ModelAndView myfun1(HttpSession session)
	{
	  ModelAndView mv=new ModelAndView("/Home");
	  /*session.setAttribute("category", category);
	  session.setAttribute("categoryList", categoryDAO.list());*/
	 
	  return mv;
		
	}
	@RequestMapping("/login")
	public ModelAndView Login(){
		ModelAndView mv= new ModelAndView("/Login");
		return mv;
		
	}
	
	@RequestMapping("/register")
	public ModelAndView Register(){
		ModelAndView mv = new ModelAndView("/Register");
		return mv;
	}

}

/* @RequestMapping("/loginHere")
public ModelAndView loginHere() {
	ModelAndView mv = new ModelAndView("/home");
	mv.addObject("userDetails", new UserDetails());
	mv.addObject("isUserClickedLoginHere", "true");
	return mv;
}*/
