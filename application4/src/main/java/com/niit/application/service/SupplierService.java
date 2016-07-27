package com.niit.application.service;

import java.util.List;

import com.niit.application.model.SupplierModel;

public interface SupplierService {
	public void addSupplier(SupplierModel ndm);
	List<SupplierModel> getSupplierList();
	public String deleteSupplier(String sid);
	public int updateSupplier(SupplierModel ndm);
}
