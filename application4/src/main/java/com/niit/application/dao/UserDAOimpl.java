package com.niit.application.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.application.model.UserDetails;

@Repository("UserDetails")
public class UserDAOimpl implements UserDAO{
	
	Logger log = LoggerFactory.getLogger(UserDAOimpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;   
	
	public UserDAOimpl() {}
		
	public UserDAOimpl(SessionFactory sessionFactory) {
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			log.error(" Unable to connect to db");
			e.printStackTrace();
		}
	}

	
	@Transactional
	public boolean isValidUser(String un, String pd){
		System.out.println("UserDAOImpl - isValidUser() started");
		String hql = "from UserDetails where userid= '" + un + "' and " + " password ='" + pd + "'";
		System.out.println("in userdaoimpl after hql ");
		//Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		Query query = sessionFactory.openSession().createQuery(hql);
		System.out.println("in userdaoimpl");
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		for(UserDetails u : list){
			System.out.println(u.isAdmin());
		}
		if (list != null && !list.isEmpty()) {
			return true;
		}
		System.out.println("isValidUser() ended");
		return false;
	}

@Transactional
	public boolean isAdminUser(String un, String pd){
		System.out.println("UserDAOImpl - isValidUser() started");
		String hql = "from UserDetails where userid= '" + un + "' and " + " password ='" + pd + "'";
		System.out.println("in userdaoimpl after hql ");
		//Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		Query query = sessionFactory.openSession().createQuery(hql);
		boolean res=false; 
		System.out.println("in userdaoimpl");
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		for(UserDetails u : list){
			System.out.println(u.isAdmin());
		    res=u.isAdmin();
	}
	return res;
	}
@Transactional
public void addUser(UserDetails ud){
	Session s=sessionFactory.getCurrentSession();
	Transaction t=s.beginTransaction();
	System.out.println("User dao impl" +  ud);
	s.saveOrUpdate(ud);
	t.commit();		
}
}