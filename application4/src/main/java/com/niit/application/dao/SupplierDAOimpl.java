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
import com.niit.application.model.SupplierModel;

@Repository
@Transactional
public class SupplierDAOimpl implements SupplierDAO{
SupplierModel suppliermodel;
	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public void SupplierDAOimpl(){}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void addSupplier(SupplierModel ndm) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println(ndm);
		s.saveOrUpdate(ndm);
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
	@Transactional
	public String deleteSupplier(String sid) {
		System.out.println("delsupplier()in DAO is running....");
		Session session = sessionFactory.openSession();
		System.out.println("session:"+session);
		SupplierModel nd = new SupplierModel();
		int id = Integer.parseInt(sid);
		nd.setSupplierId(id);
		session.delete(nd);		
		session.flush();
		System.out.println("delproduct()in DAO is running....completed");
		return sid;
	}
	public String editSupplier(SupplierModel ndm) {
		
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction)session.beginTransaction();
		SupplierModel nd = (SupplierModel)session.load(SupplierModel.class,ndm.getSupplierId());
		System.out.println("update dao "+ ndm.getSupplierId());
		if(nd!=null){
			session.update(ndm);
			System.out.println("update dao update true");
		}
		tx.commit();
		
		return null;
	}

}
