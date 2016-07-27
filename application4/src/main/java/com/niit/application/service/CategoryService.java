package com.niit.application.service;

import java.util.List;


import com.niit.application.model.CategoryModel;

public interface CategoryService {
	public void addCategory(CategoryModel ndm);
	public String deleteCategory(String cid);
	public int updateCategory(CategoryModel ndm);
	List<CategoryModel> getCategoryList();
	
}
