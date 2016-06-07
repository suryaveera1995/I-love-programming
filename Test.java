package com.niit.shoppingcard.bean;
import com.niit.shoppingcard.bean.*;
public class Test {
	public static void main(String args[])
	{
		Product product = new Product();
		product.setId(101);
		product.setName("mobile");
		product.setPrice(-10000d);
		System.out.println("id:"+product.getId());
		System.out.println("name:"+product.getName());
		System.out.println("price:"+product.getPrice());
		
	}

}
