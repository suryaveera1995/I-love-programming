package com.niit.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductModel")
public class ProductModel {
	@Id 
	private int ProductID;
	private String ProductName;
	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}

	public String getProductDetails() {
		return ProductDetails;
	}

	public void setProductDetails(String productDetails) {
		ProductDetails = productDetails;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductPhotoURL() {
		return ProductPhotoURL;
	}

	public void setProductPhotoURL(String productPhotoURL) {
		ProductPhotoURL = productPhotoURL;
	}

	private String ProductCategory;
	private String ProductDetails; 
	private int ProductPrice;
	
	private String ProductPhotoURL;

	

}
