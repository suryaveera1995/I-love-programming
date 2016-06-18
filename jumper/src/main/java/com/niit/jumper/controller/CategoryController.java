package com.niit.jumper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.jumper.dao.UserDAO;

public class CategoryController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@RequestParam(value = "caregoryName")String categoryName, @RequestParam(value = "caregoryDescription") String category)
	{
	       
	       System.out.println("addCategory");
           String message = "successfully created";
           ModelAndView mv = new ModelAndView("/success");
           mv.addObject("message",message);
           
           return mv;
}
}
