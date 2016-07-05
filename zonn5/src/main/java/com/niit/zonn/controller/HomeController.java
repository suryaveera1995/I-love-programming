package com.niit.zonn.controller;


import com.google.gson.Gson;
import com.niit.zonn.model.*;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    private SessionFactory sf;
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
	@RequestMapping("/carspage")
	public ModelAndView carspage() {
        //us.insertSignupModel(sm);
		return new ModelAndView("carspage");
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
	@RequestMapping("/viewcategory")
	public ModelAndView viewcategories()
	{
		List<CategoryModel> arr=cs.getCategoryList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("categorieslist","data",gson.toJson(arr));
	}
	@RequestMapping("/supplier")
	public ModelAndView supplier() {

		return new ModelAndView("supplier","command",new SupplierModel());
	}
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute("SupplierModel") SupplierModel sm ) {
	System.out.println("in add supplier");
       ss.insertSupplierModel(sm);		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return mv;
	}
	@RequestMapping("/viewsupplier")
	public ModelAndView viewsuppliers()
	{
		List<SupplierModel> arr=ss.getSupplierList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("supplierslist","data",gson.toJson(arr));
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
	@RequestMapping("/viewproduct")
	public ModelAndView viewproducts()
	{
		List<ProductModel> arr=ps.getProductList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("productslist","data",gson.toJson(arr));
	}
		
		@RequestMapping("/adminhome")
		public ModelAndView adminhome(){
		ModelAndView mv= new ModelAndView("adminhome");
		return mv;
	}
		int a;
		@RequestMapping("/edit/{pid}")
		public ModelAndView edit(@PathVariable("pid")int pid,HttpServletRequest req) 
		 {
			System.out.println("in controller1");
			a=pid;
			System.out.println("in controller2");
			ProductModel p=new ProductModel();			
			System.out.println("in controller3");
			Session s=sf.openSession();
			ProductModel p1=(ProductModel)s.get(ProductModel.class,a);
			System.out.println("haiiiiii");
			System.out.println("p1.getPname()"+p1.getProductname());
			ModelAndView m1 = new ModelAndView("updatepage");HttpSession sess=req.getSession();
			sess.setAttribute("data1",p1);
			m1.addObject("command", p1);
			System.out.println(p1.getProductname());
			m1.addObject("data", p1);		 
			return m1;
			}
		@RequestMapping("edit/updateproduct")
		public ModelAndView update(@ModelAttribute("toys")ProductModel p) 
		 {
			ps.update(p);
			return new ModelAndView("redirect:/viewproduct");  
		 }	
		
		
	}
		

