package com.niit.zonn.service;

import java.util.List;


import com.niit.zonn.model.ProductModel;

public interface ProductService {
	public void insertProductModel(ProductModel u);
	List<ProductModel> getProductList();
	void remove(Integer pid);
	public void update(ProductModel p);

}
