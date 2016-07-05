package com.niit.zonn.dao;

import java.util.List;


import com.niit.zonn.model.CategoryModel;

public interface CategoryDAO {
	public void insertCategoryModel(CategoryModel u);
	public List<CategoryModel> getCategoryList();


}
