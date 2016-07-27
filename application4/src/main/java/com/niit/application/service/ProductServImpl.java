package com.niit.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.niit.application.dao.ProductDAO;
import com.niit.application.model.ProductModel;

@Service
public class ProductServImpl implements ProductService{
	@Autowired
	private ProductDAO deviceData;
	
	public List<ProductModel> getAllDevices() {
		// TODO Auto-generated method stub
		System.out.println("\nNetworkDevServ-getAllDev()");
		return deviceData.getAllDevices();
	}

	public void addDevice(ProductModel ndm) {
		// TODO Auto-generated method stub
		System.out.println("\nNetworkDevServ-addDevice()");
		deviceData.addDevice(ndm); 
	}

	public ProductModel getDevice(String did) {
		// TODO Auto-generated method stub
		System.out.println("\nNetworkDevServ-getDevice()");
		return deviceData.getDevice(did);
	}

	public String updateDevice(ProductModel ndm) {
		// TODO Auto-generated method stub
		deviceData.editDevice(ndm);
		return null;
	}

	public String deleteDevice(String did){
		return deviceData.delDevice(did);
	}

	public ProductModel getBag(String setName) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductModel getProduct(String setName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

