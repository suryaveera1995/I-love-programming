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

import com.niit.zonn.model.SupplierModel;

@Repository
public class SupplierDAOimpl implements SupplierDAO {
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	    @Transactional
		public void insertSupplierModel(SupplierModel u)
		{
			Session s=this.sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(u);
			t.commit();

}
			@SuppressWarnings("unchecked")
			@Transactional(propagation=Propagation.SUPPORTS)
			public List<SupplierModel> getSupplierList()// method of ProductDAOInt defined
			{
				System.out.println("-----------  "+sessionFactory);
				Session s=sessionFactory.openSession();
				Transaction t = s.beginTransaction();
				System.out.println("In dao ");
				List<SupplierModel> al=new ArrayList<SupplierModel>();
						 al=s.createQuery("from SupplierModel").list();
				 t.commit();
				 return al;
			} 
			public void update(SupplierModel s){
				System.out.println("In update product");
				Session ss=sessionFactory.openSession();
				Transaction t = ss.beginTransaction();
				SupplierModel s1=(SupplierModel)ss.load(SupplierModel.class,s.getSupplierid());
				if(s1!=null)
				{
					System.out.println("****inif");
					ss.update(s);
				}
				t.commit();
				}
			@Transactional
			public void remove(Integer sid)
			{
			
				Session s=sessionFactory.openSession();
				Transaction t=s.beginTransaction();
				SupplierModel c=(SupplierModel)s.load(SupplierModel.class,new Integer(sid));
				if(s!=null)
				{
					s.delete(c);
				}
				t.commit();
			}
}
