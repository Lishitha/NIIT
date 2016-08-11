package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		//
		CategoryDAO categoryDAO = (CategoryDAO) con.getBean("categoryDAO");
		
		Category category= (Category) con.getBean("category");
		category.setId("CAT0089");
		category.setName("SHOE89");
		category.setDescription("THIS ARE SHOES");
		
		categoryDAO.saveOrUpdate(category);
		
		System.out.println("updated");
		
		/*
		if(categoryDAO.get("sdfghg")==null)
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
