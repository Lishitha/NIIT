package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;
	
	//TO ADD PRODUCT
	@RequestMapping(value="/to_add_product",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Product product)
	{
		productDAO.saveOrUpdate(product);
		ModelAndView mv=new ModelAndView("/Home");
		mv.addObject("productSuccessMsg", "Product successfully added");
		return mv;
	}
	
	//TO DELETE PRODUCT
	@RequestMapping("deleteProduct/{id}")
	public String deleteProduct (@PathVariable("id") String id, Model model)
	{
		productDAO.delete(id);
		return "Home";
	}


}
