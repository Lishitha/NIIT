package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;


public class CartTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		CartDAO cartDAO =  (CartDAO) con.getBean("cartDAO");
		
		Cart cart= (Cart) con.getBean("cart");
		cart.setId("CART02");
		cart.setPrice(150);
		cart.setQuantity(2);
		cart.setTotal(300);
		cart.setUserId("US02");
		cart.setProductName("PRDCT1");
		cart.setStatus("AVAILABLE");
		
		cartDAO.saveOrUpdate(cart);
		
		System.out.println("updated");
	}

}
