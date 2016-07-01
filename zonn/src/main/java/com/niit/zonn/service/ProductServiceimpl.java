package com.niit.zonn.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niit.zonn.dao.ProductDAO;
import com.niit.zonn.model.ProductModel;

@Service
public class ProductServiceimpl implements ProductService{
	@Autowired
	ProductDAO productDAO;
	public void insertProductModel(ProductModel u)
	{
		productDAO.insertProductModel(u);
	}

}
