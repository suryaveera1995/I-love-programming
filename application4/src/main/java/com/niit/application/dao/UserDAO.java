package com.niit.application.dao;

import com.niit.application.model.UserDetails;

public interface UserDAO {
	public boolean isValidUser(String un, String pd);

	public boolean isAdminUser(String userid, String passwd);
	public void addUser(UserDetails ud);

}

	

