package com.niit.application.dao;

import java.util.List;

import com.niit.application.model.ProductModel;

public interface ProductDAO {
	public List<ProductModel> getAllDevices();
	public ProductModel getDevice(String did);
	public String editDevice(ProductModel ndm);
	public String delDevice(String did);
	public void addDevice(ProductModel ndm); 



}

