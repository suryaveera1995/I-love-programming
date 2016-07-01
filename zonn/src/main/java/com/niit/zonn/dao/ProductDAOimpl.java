package com.niit.zonn.dao;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.zonn.model.ProductModel;


@Repository
public class ProductDAOimpl implements ProductDAO{
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	    @Transactional
		public void insertProductModel(ProductModel u)
		{
			Session s=this.sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(u);
			t.commit();

}
}
