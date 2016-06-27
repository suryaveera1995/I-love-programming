package com.niit.newproject.controller;


import com.niit.newproject.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.newproject.model.SignUpModel;
import com.niit.newproject.service.UserService;

@Controller
public class userController {
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public ModelAndView getHomePage() {

	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		
		return new ModelAndView("signup","command",new SignUpModel());
	}
	@RequestMapping("/addcustomer")
		public ModelAndView addCustomer(@ModelAttribute("SignupModel") SignUpModel sm ) {
		System.out.println("in add customer");
        us.insertSignupModel(sm);
			
			ModelAndView mv=new ModelAndView("signup","command",new SignUpModel());
			return mv;
		}

		


	@RequestMapping("/login")
	public ModelAndView login() {

		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/customercare")
	public ModelAndView customercare() {

		
		ModelAndView mv=new ModelAndView("customercare");
		return mv;
	}
}
