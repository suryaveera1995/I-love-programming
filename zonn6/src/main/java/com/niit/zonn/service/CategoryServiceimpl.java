package com.niit.zonn.service;

import java.util.List;



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
	public List<CategoryModel> getCategoryList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<CategoryModel> a=categoryDAO.getCategoryList();
		System.out.println(a);
		return a;
	
	}
	public void update(CategoryModel c) {
		// TODO Auto-generated method stub
		categoryDAO.update(c);
		
	}
	public void remove(Integer cid) {
		// TODO Auto-generated method stub
		categoryDAO.remove(cid);
		
	}


}
