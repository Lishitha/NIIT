package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="userDetails")
@Component
public class UserDetails {

	@Id
	private String id;
	private String name;
	private String mailID;
	private String address;
	private int contactNumber;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int i) {
		this.contactNumber = i;
	}
	
	
	
	
}
