package com.niit.application.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.application.dao.SupplierDAO;
import com.niit.application.model.SupplierModel;

@Service
public class SupplierServiceimpl implements SupplierService{
	@Autowired
	private	 SupplierDAO supplierdao;
	
	public void addSupplier(SupplierModel ndm) {
		System.out.println("In Supplierserviceimpl");
		supplierdao.addSupplier(ndm); 
	}
	public List<SupplierModel> getSupplierList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<SupplierModel> a=supplierdao.getSupplierList();
		System.out.println(a);
		return a;
	}
	public String deleteSupplier(String sid) {
		// TODO Auto-generated method stub
		System.out.println("\nDelete-service");
		return supplierdao.deleteSupplier(sid);
	
	}
	public int updateSupplier(SupplierModel ndm) {
		/// TODO Auto-generated method stub
		supplierdao.editSupplier(ndm);
		return 0;
	}

}
