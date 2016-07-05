package com.niit.zonn.model;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.stereotype.Component;

@Entity
@Table(name="Category")
public class CategoryModel 
{
	@Id
	@Column
	private String categoryid;
@Column
private String categoryname;

@Column
private String categorysize;
@Column
private String categoryprice;
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
public String getCategoryid() {
	return categoryid;
}
public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}
public String getCategorysize() {
	return categorysize;
}
public void setCategorysize(String categorysize) {
	this.categorysize = categorysize;
}
public String getCategoryprice() {
	return categoryprice;
}
public void setCategoryprice(String categoryprice) {
	this.categoryprice = categoryprice;
}

}
