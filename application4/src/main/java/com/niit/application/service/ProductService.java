package com.niit.application.service;

import java.util.List;

import com.niit.application.model.ProductModel;
import com.niit.application.model.SupplierModel;
public interface ProductService {

	public List<ProductModel> getAllDevices();
	public void addDevice(ProductModel ndm);
	public ProductModel getDevice(String setName);
	public String updateDevice(ProductModel ndm);
	public String deleteDevice(String did);

	public ProductModel getProduct(String setName);
	
	}

