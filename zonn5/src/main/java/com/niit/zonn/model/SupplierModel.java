package com.niit.zonn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class SupplierModel {

	@Column
	private String suppliername;
	@Id
	@Column
	private String supplierid;
	@Column
	private String supplierphoneno;
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getSupplierphoneno() {
		return supplierphoneno;
	}
	public void setSupplierphoneno(String supplierphoneno) {
		this.supplierphoneno = supplierphoneno;
	}

}
