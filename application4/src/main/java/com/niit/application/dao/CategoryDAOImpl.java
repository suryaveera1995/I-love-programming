package com.niit.application.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.application.model.CategoryModel;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
      CategoryModel categorymodel;
	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public  CategoryDAOImpl(){}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void addCategory(CategoryModel ndm) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println(ndm);
		s.saveOrUpdate(ndm);
		t.commit();	
	}
	@Transactional
	public String deleteCategory(String cid) {
		System.out.println("delcategory()in DAO is running....");
		Session session = sessionFactory.openSession();
		System.out.println("session:"+session);
		CategoryModel nd = new CategoryModel();
		int id = Integer.parseInt(cid);
		nd.setCategoryId(id);
		session.delete(nd);		
		session.flush();
		System.out.println("delproduct()in DAO is running....completed");
		return cid;
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

	public String editCategory(CategoryModel ndm) {
		
			// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();
			Transaction tx = (Transaction)session.beginTransaction();
			CategoryModel nd = (CategoryModel)session.load(CategoryModel.class,ndm.getCategoryId());
			System.out.println("update dao "+ ndm.getCategoryId());
			if(nd!=null){
				session.update(ndm);
				System.out.println("update dao update true");
			}
			tx.commit();
			
			return null;
		}
}
