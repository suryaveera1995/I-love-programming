package com.niit.zonn.dao;
import com.niit.zonn.model.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAOimpl implements UserDAO{
	
@Autowired
private SessionFactory sessionFactory;
    @Transactional
	public void insertSignupModel(SignupModel u)
	{
		Session s=this.sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(u);
		t.commit();
	}
	
	
	
}

