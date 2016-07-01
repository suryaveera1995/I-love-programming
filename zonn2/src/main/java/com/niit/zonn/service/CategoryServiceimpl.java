package com.niit.zonn.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.niit.zonn.dao.CategoryDAO;
import com.niit.zonn.model.CategoryModel;

@Service
public class CategoryServiceimpl implements CategoryService {
	@Autowired
	CategoryDAO categoryDAO;
	public void insertCategoryModel(CategoryModel u)
	{
		categoryDAO.insertCategoryModel(u);
	}

}
