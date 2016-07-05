package com.niit.zonn.dao;

import java.util.ArrayList;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.zonn.model.CategoryModel;

@Repository
public class CategoryDAOimpl implements CategoryDAO {
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	    @Transactional
		public void insertCategoryModel(CategoryModel u)
		{
			Session s=this.sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(u);
			t.commit();

}
			@SuppressWarnings("unchecked")
			@Transactional(propagation=Propagation.SUPPORTS)
			public List<CategoryModel> getCategoryList()// method of ProductDAOInt defined
			{
				System.out.println("-----------  "+sessionFactory);
				Session s=sessionFactory.openSession();
				Transaction t = s.beginTransaction();
				System.out.println("In dao ");
				List<CategoryModel> al=new ArrayList<CategoryModel>();
						 al=s.createQuery("from CategoryModel").list();
				 t.commit();
				 return al;
			}  
}