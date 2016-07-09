package com.niit.zonn.service;

import java.util.List;


import com.niit.zonn.model.CategoryModel;

public interface CategoryService {
	public void insertCategoryModel(CategoryModel u);
	List<CategoryModel> getCategoryList();
	void remove(Integer cid);
	void update(CategoryModel c);



}
