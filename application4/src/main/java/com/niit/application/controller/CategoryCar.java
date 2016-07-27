package com.niit.application.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.application.model.CategoryModel;
import com.niit.application.model.ProductModel;
import com.niit.application.service.CategoryService;


@Controller
public class CategoryCar {
	@Autowired
	private CategoryService categoryserv;
	@Autowired
	private SessionFactory sessionFactory;  
	String setName = "";
	@RequestMapping("/addCat") // from admin.jsp
	public ModelAndView addCategory() {
		System.out.println("in add category controller");
		System.out.println("\nMyContoller - addcategory");
		ModelAndView mv = new ModelAndView("addCategory");
		return mv;
		//return null;
	}
	
	@RequestMapping("/addCategory") // from addProduct.jsp
    public ModelAndView storeProduct(@RequestParam(value="CategoryId")String cid,
    		@RequestParam(value="CategoryName")String cn,
    		@RequestParam(value="CategoryDetails")String cdet)
    		
    {
    	System.out.println("In Add category method : " + cn );
    	CategoryModel c = new CategoryModel();
    	c.setCategoryId(Integer.parseInt(cid));
    	c.setCategoryName(cn);
    	
    	c.setCategoryDetails(cdet);
    	 	
    	//System.out.println("test:"+p.getDeviceName());
    	
    	categoryserv.addCategory(c);
    	return new ModelAndView("success");
    	
    }
	
	@RequestMapping("/viewcategory") // from admin.jsp
	public ModelAndView viewcategories()
	{
		List<CategoryModel> arr=categoryserv.getCategoryList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("categorylist","data",gson.toJson(arr));
	}
	
	@RequestMapping("/deleteCategory") // from admin.jsp
	public ModelAndView deleteCategory(@RequestParam(value="id")String cid) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(cid);
		
		System.out.println("\nCategoryContoller - deleteCategory - " + cid);
		int id = Integer.parseInt(cid);
		categoryserv.deleteCategory(cid);
		System.out.println("\ncategoryContoller - deleteCategory - " + id + " - completed");
		ModelAndView mv = new ModelAndView("deletesuccess");		
		return mv;		
	}
	@RequestMapping("/editCategoryPage") // from categorylist.jsp
	public ModelAndView editCategory(@RequestParam(value="id")String cid, HttpServletRequest request) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(cid);
		System.out.println("\nMyContoller - editCategoryPage - " + cid);
		int id = Integer.parseInt(cid);
		//devserv.deleteDevice(id);
		CategoryModel nd = new CategoryModel();
		Session s = sessionFactory.openSession();
		ModelAndView mv = new ModelAndView("editCategoryPage");
		
		CategoryModel nd1 = (CategoryModel)s.get(CategoryModel.class,id);
		HttpSession session = request.getSession();
		session.setAttribute("data", nd1);				
		session.setAttribute("devid",cid);
		mv.addObject("devid",cid);
		mv.addObject("command",nd1);
		//String str=(String)session.getAtt
		System.out.println("\nMyContoller - editCategoryPage - " + id + " - completed");
		return mv;		
	}
	
	@RequestMapping("editCategoryData")
	public ModelAndView update(@ModelAttribute("application")CategoryModel c) 
	 {
		categoryserv.updateCategory(c);
		return new ModelAndView("success");  
	 }
	
}
