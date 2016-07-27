package com.niit.application.service;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.application.dao.UserDAO;
import com.niit.application.model.UserDetails;

public class UserServiceimpl implements UserService {

	@Autowired
	private UserDAO udao;
 	
	@Autowired
	private SessionFactory sessionFactory;   
	
	
	public UserServiceimpl(SessionFactory sf){
		this.sessionFactory =sf;
	}
	
	public boolean isValidUser(String un, String pd) {
		// TODO Auto-generated method stub
		System.out.println("UserServImpl - isValidUser() - started....");
		return udao.isValidUser(un, pd);			
	}
	
	public void addUser(UserDetails ud){
		System.out.println("\nUserServImpl - addUser()");
		 udao.addUser(ud); 	
	}


}
