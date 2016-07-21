package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		ProductDAO productDAO = (ProductDAO) con.getBean("productDAO");
		
		Product product= (Product) con.getBean("product");
		product.setId("PRO001");
		product.setName("MOBILE");
		product.setDescription("ABCDASDFGGH");
		product.setPrice(100);
		
		productDAO.saveOrUpdate(product);
		/*
		if(productDAO.get("sdfghg")==null)
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
