package com.niit.shoppingcart;





import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		
		con.scan("com.niit.shoppingcart");
		con.refresh();
		
		SupplierDAO supplierDAO = (SupplierDAO) con.getBean("supplierDAO");
		
		Supplier supplier= (Supplier) con.getBean("supplier");
		
		supplier.setId("SUP01");
		supplier.setName("JAY");
		supplier.setAddress("KOCHI");
		
		supplierDAO.saveOrUpdate(supplier);
		
		/*
		if(supplierDAO.get("sdfghg")==null)
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
