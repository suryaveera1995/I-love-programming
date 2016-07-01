package com.niit.zonn.controller;


import com.niit.zonn.model.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.zonn.service.CategoryService;
import com.niit.zonn.service.ProductService;
import com.niit.zonn.service.SupplierService;
import com.niit.zonn.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService us;
    @Autowired
	ProductService ps;
    @Autowired
	CategoryService cs;
    @Autowired
	SupplierService ss;
	@RequestMapping("/")
	public ModelAndView getHomePage() {	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		return new ModelAndView("signup","command",new SignupModel());
	}
	@RequestMapping("/addcustomer")
		public ModelAndView addCustomer(@ModelAttribute("SignupModel") SignupModel sm ) {
		System.out.println("in add customer");
            us.insertSignupModel(sm);			
			ModelAndView mv=new ModelAndView("signup","command",new SignupModel());
			return mv;
		}
	

	@RequestMapping("/product")
	public ModelAndView product() {

		return new ModelAndView("product","command",new ProductModel());
	}
	@RequestMapping("/addproduct")
	public ModelAndView addProduct(@ModelAttribute("ProductModel") ProductModel pm ) {
	System.out.println("in add product");
        ps.insertProductModel(pm);		
		ModelAndView mv=new ModelAndView("product","command",new ProductModel());
		return mv;
	}

	@RequestMapping("/category")
	public ModelAndView category() {

		return new ModelAndView("category","command",new CategoryModel());
	}
	@RequestMapping("/addcategory")
	public ModelAndView addCategory(@ModelAttribute("CategoryModel") CategoryModel cm ) {
	System.out.println("in add category");
       cs.insertCategoryModel(cm);		
		ModelAndView mv=new ModelAndView("category","command",new CategoryModel());
		return mv;
	}
	@RequestMapping("/supplier")
	public ModelAndView supplier() {

		return new ModelAndView("supplier","command",new SupplierModel());
	}
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute("SupplierModel") SupplierModel sm ) {
	System.out.println("in add category");
       ss.insertSupplierModel(sm);		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return mv;
	}

	@RequestMapping("/carspage")
	public ModelAndView carspage() {
        //us.insertSignupModel(sm);
		return new ModelAndView("carspage");
	}
		
}
