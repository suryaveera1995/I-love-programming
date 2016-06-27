package com.niit.newproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.newproject.dao.UserDAO;
import com.niit.newproject.model.SignUpModel;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;
	public void insertSignupModel(SignUpModel u)
	{
		userDAO.insertSignUpModel(u);
	}
	

}
