package com.niit.zonn.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niit.zonn.dao.SupplierDAO;
import com.niit.zonn.model.SupplierModel;

@Service
public class SupplierServiceimpl implements SupplierService {
	@Autowired
	SupplierDAO supplierDAO;
	public void insertSupplierModel(SupplierModel u)
	{
		supplierDAO.insertSupplierModel(u);
	}

}
