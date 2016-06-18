package com.niit.jumper.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAO {
	
	public static List<Category> getAllCategories()
	{
		List<Category> list = new ArrayList<Category>();
		CategoryDAO c1=new CategoryDAO();
		c1.setID("1");
		c1.setName("m");
		c1.setDescription("this is m");
		return list;
	}

	private void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setID(String string) {
		// TODO Auto-generated method stub
		
	}

	public static List<Category> updateCategories() {
		// TODO Auto-generated method stub
		return null;
	}
}
