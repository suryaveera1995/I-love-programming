package com.niit.newproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.newproject.*;
@Controller
public class ccController 
{
	@RequestMapping("/")
	public ModelAndView welcomepage()
	{
	
		return new ModelAndView("index");
	}
	@RequestMapping("/signup")
	public ModelAndView signup()
	{
	
		return new ModelAndView("signup");
	}
	@RequestMapping("/carspage")
	public ModelAndView parspage()
	{
	
		return new ModelAndView("carspage");
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
	
		return new ModelAndView("login");
	}
	@RequestMapping("/care")
	public ModelAndView care()
	{
	
		return new ModelAndView("care");
	}
}
	
