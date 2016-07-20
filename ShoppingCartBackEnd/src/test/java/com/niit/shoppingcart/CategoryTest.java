package com.niit.shoppingcart;





import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) con.getBean("categoryDAO");
		
		Category category= (Category) con.getBean("category");
		category.setId("REALECS017");
		category.setName("LEENA");
		category.setDescription("ABCDASDFGGH");
		
		categoryDAO.saveOrUpdate(category);
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
