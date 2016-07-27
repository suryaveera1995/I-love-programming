package com.niit.application.dao;

import java.util.List;


import com.niit.application.model.CategoryModel;


public interface CategoryDAO {
	public void addCategory(CategoryModel ndm); 
	public String deleteCategory(String cid);
	public List<CategoryModel> getCategoryList();
	public String editCategory(CategoryModel ndm);
}
