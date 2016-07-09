package com.niit.zonn.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.stereotype.Component;

@Entity
@Table(name="Category1")
public class CategoryModel 
{
	@Id
	@Column
	private int categoryid;
public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
@Column
private String categoryname;

@Column
private String categorysize;
@Column
private int categoryprice;
public int getCategoryprice() {
	return categoryprice;
}
public void setCategoryprice(int categoryprice) {
	this.categoryprice = categoryprice;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

public String getCategorysize() {
	return categorysize;
}
public void setCategorysize(String categorysize) {
	this.categorysize = categorysize;
}


}
