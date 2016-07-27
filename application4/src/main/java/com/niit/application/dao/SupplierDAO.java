package com.niit.application.dao;

import java.util.List;


import com.niit.application.model.SupplierModel;

public interface SupplierDAO {
	public List<SupplierModel> getSupplierList();
	public void addSupplier(SupplierModel ndm); 
	public String deleteSupplier(String sid);
	public String editSupplier(SupplierModel ndm);
}
