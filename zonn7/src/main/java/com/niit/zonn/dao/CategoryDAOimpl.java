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
			public void update(CategoryModel c){
				System.out.println("In update category");
				Session s=sessionFactory.openSession();
				Transaction t = s.beginTransaction();
				CategoryModel c1=(CategoryModel)s.load(CategoryModel.class,c.getCategoryid());
				if(c1!=null)
				{
					System.out.println("****inif");
					s.update(c);
				}
				t.commit();
				}
			@Transactional
			public void remove(Integer cid)
			{
			
				Session s=sessionFactory.openSession();
				Transaction t=s.beginTransaction();
				CategoryModel c=(CategoryModel)s.load(CategoryModel.class,new Integer(cid));
				if(c!=null)
				{
					s.delete(c);
				}
				t.commit();
			}
}