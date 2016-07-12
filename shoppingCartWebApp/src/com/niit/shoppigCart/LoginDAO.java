package com.niit.shoppigCart;

public class LoginDAO {
	
	public boolean isValidUser(String userID,String passWord)
	{
		if(userID.equals(passWord))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
