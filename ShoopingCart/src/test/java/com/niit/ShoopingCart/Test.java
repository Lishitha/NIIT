package com.niit.ShoopingCart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.ShoopingCart");
		context.refresh();
		context.getBean("category");
		
		System.out.println("Category is created");

	}

}
