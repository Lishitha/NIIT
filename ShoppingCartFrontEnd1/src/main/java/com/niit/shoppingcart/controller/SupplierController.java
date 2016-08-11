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

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;

	
	//TO ADD SUPPLIER
		@RequestMapping(value="/to_add_supplier",method=RequestMethod.POST)
		public ModelAndView addSupplier(@ModelAttribute Supplier supplier)
		{
			supplierDAO.saveOrUpdate(supplier);
			ModelAndView mv=new ModelAndView("/Home");
			mv.addObject("supplierSuccessMsg", "Supplier successfully added");
			return mv;
		}
		
		//TO EDIT SUPPLIER
		@RequestMapping(value="/editSupplier/{id}")
		public String editCategory(@PathVariable("id") String id, ModelMap model)
		{
			supplier=supplierDAO.get(id);
			model.addAttribute("supplier",supplier);
			model.addAttribute("supplierList",supplierDAO.list());
			return "Home";
		}
		
		
		
		//TO DELETE SUPPLIER
		@RequestMapping("deleteSupplier/{id}")
		public String deleteSupplier (@PathVariable("id") String id, Model model)
		{
			supplierDAO.delete(id);
			return "Home";
		}
		
		
	
}
