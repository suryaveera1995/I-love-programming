package com.niit.application.dao;

import java.util.ArrayList;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.application.model.ProductModel;


@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	List <ProductModel> lst = new ArrayList<ProductModel>();
	
	ProductModel deviceData;
	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public ProductDAOImpl(){}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	public List<ProductModel> getAllDevices() {
		// TODO Auto-generated method stub
		List<ProductModel> lst;
		System.out.println("getAllDevices()");
		Session ses = sessionFactory.openSession();
		System.out.println("getAllDevices()session " + ses.isOpen());
		Query qry = ses.createQuery("from ProductModel");
		lst = qry.list();
		System.out.println(lst);
		return lst;			
	}

	public ProductModel getDevice(String did) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		deviceData = (ProductModel)ses.get(ProductModel.class,did);
		return deviceData;
	}

	

	
	@Transactional
	public void addDevice(ProductModel ndm) {		
			Session s=sessionFactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			System.out.println(ndm);
			s.saveOrUpdate(ndm);
			t.commit();		
	}
	@Transactional
	public String delDevice(String did) {
		
		System.out.println("deldevice()in DAO is running....");
		Session session = sessionFactory.openSession();
		System.out.println("session:"+session);
		ProductModel nd = new ProductModel();
		int id=Integer.parseInt(did);
		nd.setProductID(id);
		session.delete(nd);		
		session.flush();
		System.out.println("deldevice()in DAO is running....completed");
		return did;
	}
	@Transactional
	public String editDevice(ProductModel ndm) { 
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction)session.beginTransaction();
		ProductModel nd = (ProductModel)session.load(ProductModel.class,ndm.getProductID());
		System.out.println("update dao "+ ndm.getProductID());
		if(nd!=null){
			session.update(ndm);
			System.out.println("update dao update true");
		}
		tx.commit();
		
		return null;
	}
	

	

	
}