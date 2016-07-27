package com.niit.application.service;

import com.niit.application.model.UserDetails;

public interface UserService {
	public boolean isValidUser(String un, String pd);
	public void addUser(UserDetails ud);
}
