package com.niit.zonn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier1")
public class SupplierModel {

	@Column
	private String suppliername;
	@Id
	@Column
	private int supplierid;
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	@Column
	private String supplierphoneno;
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	
	public String getSupplierphoneno() {
		return supplierphoneno;
	}
	public void setSupplierphoneno(String supplierphoneno) {
		this.supplierphoneno = supplierphoneno;
	}

}
