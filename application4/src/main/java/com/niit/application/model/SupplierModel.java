package com.niit.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SupplierModel")
public class SupplierModel {
	@Id 
	private int SupplierId;
	private String SupplierName;
	private String SupplierPhoneNo;
	private String SupplierDetails;
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierPhoneNo() {
		return SupplierPhoneNo;
	}
	public void setSupplierPhoneNo(String supplierPhoneNo) {
		SupplierPhoneNo = supplierPhoneNo;
	}
	public String getSupplierDetails() {
		return SupplierDetails;
	}
	public void setSupplierDetails(String supplierDetails) {
		SupplierDetails = supplierDetails;
	}
}
