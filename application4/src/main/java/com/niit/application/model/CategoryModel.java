package com.niit.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CategoryModel01")
public class CategoryModel {
	@Id 
	private int CategoryId;
	private String CategoryName;
	private String CategoryDetails;
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDetails() {
		return CategoryDetails;
	}
	public void setCategoryDetails(String categoryDetails) {
		CategoryDetails = categoryDetails;
	}



}
