package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public String categoryList(Model model)
	{
		model.addAttribute("isAdminCLickedCategory", "true");
		model.addAttribute("category",category);
		model.addAttribute("categoryList", this.categoryDAO.list());
		return "Home";
	}
	
	//TO ADD CATEGORY
	@RequestMapping(value="/to_add_category",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category)
	{
		categoryDAO.saveOrUpdate(category);
		//ModelAndView mv=new ModelAndView("redirect:/category");
		//model.addAtt("categorySuccessMsg", "Category successfully added");
		return "redirect:/category";
	}
	
	//TO EDIT CATEGORY
	@RequestMapping(value="/editCategory/{id}")
	public String editCategory(@PathVariable("id") String id, ModelMap model)
	{
		category=categoryDAO.get(id);
		model.addAttribute("category", category);
		model.addAttribute("categoryList",categoryDAO.list());
		return "redirect:/category";
	}
	
	

	
    //TO DELETE CATEGORY
	@RequestMapping("/deleteCategory/{id}")
	public String deleteCategory (@PathVariable("id") String id, ModelMap model)
	{
		categoryDAO.delete(id);
		return "redirect:/category";
	}
	
	
	
	
	
	
	

}
