package com.niit.zonn.controller;

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
import com.niit.zonn.model.CategoryModel;
import com.niit.zonn.service.CategoryService;
@Controller
public class CategoryController {
	@Autowired
	CategoryService cs;
	  @Autowired
	 private SessionFactory sf;
	int b;
	@RequestMapping("/editcategory/{cid}")
	public ModelAndView edit(@PathVariable("cid")int cid,HttpServletRequest req) 
	 {
		System.out.println("in controller1");
		b=cid;
		System.out.println("in controller2");
		CategoryModel c=new CategoryModel();			
		System.out.println("in controller3");
		Session s=sf.openSession();
		CategoryModel c1=(CategoryModel)s.get(CategoryModel.class,b);
		System.out.println("haiiiiii");
		System.out.println("c1.getCname()"+c1.getCategoryname());
		ModelAndView m2 = new ModelAndView("updatecategory");HttpSession sess=req.getSession();
		sess.setAttribute("data1",c1);
		m2.addObject("command", c1);
		System.out.println(c1.getCategoryname());
		m2.addObject("data", c1);		 
		return m2;
		}
	
	@RequestMapping("editcategory/updatecategory")
	public ModelAndView update(@ModelAttribute("toys")CategoryModel c) 
	 {
		cs.update(c);
		return new ModelAndView("redirect:/viewcategory");  
	 }	
	
}
