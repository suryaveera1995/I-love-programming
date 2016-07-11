package com.niit.zonn.dao;

import java.util.List;

import com.niit.zonn.model.SupplierModel;

public interface SupplierDAO {
	
	public void insertSupplierModel(SupplierModel u);
	public List<SupplierModel> getSupplierList();
	void remove(Integer sid);
	void update(SupplierModel s);

}
