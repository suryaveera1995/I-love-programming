package com.niit.application.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.application.dao.CategoryDAO;
import com.niit.application.model.CategoryModel;
@Service
public class CategoryServiceimpl implements CategoryService {
	@Autowired
	private	 CategoryDAO categorydao;
	
	public void addCategory(CategoryModel ndm) {
		System.out.println("In Categeoryserviceimpl");
		categorydao.addCategory(ndm); 
	}
	public String deleteCategory(String cid) {
		// TODO Auto-generated method stub
		System.out.println("\nDelete-service");
		return categorydao.deleteCategory(cid);
	
	}
	public List<CategoryModel> getCategoryList() {
		// TODO Auto-generated method stub
		System.out.println("In SERVICE");
		List<CategoryModel> a=categorydao.getCategoryList();
		System.out.println(a);
		return a;
	
	}
	public int updateCategory(CategoryModel ndm) {
		/// TODO Auto-generated method stub
		categorydao.editCategory(ndm);
		return 0;
	}


}
