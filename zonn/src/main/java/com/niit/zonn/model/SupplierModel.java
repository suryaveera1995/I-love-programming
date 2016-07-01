package com.niit.zonn.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class SupplierModel {
	@Id
	@Column
	private String supplierid;
	@Column
	private String suppliernumber;
	@Column
	private String supplieraddress;
	
	@Column
	private String suppliername;
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
	public String getSuppliernumber() {
		return suppliernumber;
	}
	public void setSuppliernumber(String suppliernumber) {
		this.suppliernumber = suppliernumber;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	
	
}
	

