package com.niit.jumper.dao;

import org.springframework.stereotype.Repository;

public class UserDAO {

	
	public static boolean isValidUser(String userId, String password) {
		// TODO Auto-generated method stub
		if(userId.equals("NIIT") && password.equals("NIIT"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}