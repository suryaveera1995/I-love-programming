package com.niit.jumper.controller;
import com.niit.jumper.dao.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.jumper.dao.UserDAO;

@Controller
public class UserController{
	//@Autowired
	//UserDAO userDAO;
	@RequestMapping("/")
	public ModelAndView welcomepage()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value="name")String name,@RequestParam(value = "password") String password)
	{
         		
		System.out.println("in controller");
		
		String message;
		if (UserDAO.isValidUser(name, password)){
			message = "valid credentials";
		}else {
			message="Invalid credentials";
		}
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
