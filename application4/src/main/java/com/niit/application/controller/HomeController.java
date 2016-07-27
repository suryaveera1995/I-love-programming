package com.niit.application.controller;

import java.util.ArrayList;




import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.application.dao.UserDAO;
import com.niit.application.dao.UserDAOimpl;
import com.niit.application.model.ProductModel;
import com.niit.application.model.SupplierModel;
import com.niit.application.model.UserDetails;
import com.niit.application.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService devserv;
	@Autowired
	private SessionFactory sessionFactory;  
	String setName = "";
	//NetworkDevDAO ndd = null;

	@RequestMapping("/")
	public ModelAndView getFirstPage(){	
		System.out.println("\n/request maped with welcome jsp");
		ModelAndView mv = new ModelAndView("welcome");
		return mv;
	}	
	@RequestMapping("/productuserdetails")
	public ModelAndView getuserpage(){	
		System.out.println("\n/request maped with welcome jsp");
		ModelAndView mv = new ModelAndView("productuserdetails");
		return mv;
	}
	@RequestMapping("/aboutus")
	public ModelAndView getaboutus(){	
		System.out.println("\n/request maped with welcome jsp");
		ModelAndView mv = new ModelAndView("carspage");
		return mv;
	}	
	@RequestMapping("/success")
	public ModelAndView getsuccess(){	
		System.out.println("\n/request maped with success jsp");
		ModelAndView mv = new ModelAndView("success");
		return mv;
	}	
	@RequestMapping("/page3")
	public ModelAndView getPage3(){	
		System.out.println("\n/request maped with page3 jsp");
		ModelAndView mv = new ModelAndView("page3");
		return mv;
	}	
	@RequestMapping("/page0")
	public ModelAndView getPage1(){	
		System.out.println("\n/request maped with page0 jsp");
		ModelAndView mv = new ModelAndView("page0");
		return mv;
	}
	@RequestMapping("/device")
	public ModelAndView AllProductCode(
			@RequestParam(value = "name", required = false, defaultValue = "DEVICE") String name) {
		System.out.println("\n/request maped with page1 jsp(alias device)");
		ModelAndView allprod = new ModelAndView("page1");
		setName = name;
		System.out.println(setName);
		return allprod;
	}
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() {
			
		//ndd = new NetworkDevDAOImpl();
		String devs="";
		
		//if("alldev".equals(setName)){
			System.out.println("gson all devices...");
			List <ProductModel> listdev = devserv.getAllDevices();
			Gson gson = new Gson();
			devs=gson.toJson(listdev);
	//	}
		/*else{		
			System.out.println("gson one device...");
			ProductModel nd = devserv.getProduct(setName);
			List <ProductModel> ld = new ArrayList<ProductModel>();
			ld.add(nd);
			Gson gson=new Gson();
			devs=gson.toJson(ld);				
		}*/
		return devs;
	}
	@RequestMapping("/addDev") // from welcome.jsp
	public ModelAndView addDevice() {
		System.out.println("in add dev controller");
		System.out.println("\nMyContoller - addDev");
		ModelAndView mv = new ModelAndView("addDevice");
		return mv;
		//return null;
	}


	@RequestMapping("/addDevice") // from addDevice.jsp
    public ModelAndView storeProduct(@RequestParam(value="ProductID")String did,@RequestParam(value="ProductName")String dn,
    		@RequestParam(value="ProductCategory")String dcat,@RequestParam(value="ProductDetails")String ddet,
    		@RequestParam(value="ProductPrice")String dprice,
    		@RequestParam(value="ProductPhotoURL")String durl)
    {
    	System.out.println("In Add device method : " + dn );
    	ProductModel p = new ProductModel();
    	p.setProductID(Integer.parseInt(did));
    	p.setProductName(dn);
    	p.setProductCategory(dcat);
    	p.setProductDetails(ddet);
    	p.setProductPrice(Integer.parseInt(dprice));
    	p.setProductPhotoURL(durl);    	
    	//System.out.println("test:"+p.getDeviceName());
    	
    	devserv.addDevice(p);
    	//return new ModelAndView("ProductsAdded", "message", "");
    	return null;
    }
	@RequestMapping("/loginpage")
	public ModelAndView loginPage(){	
		System.out.println("\nMyController - loginpage");
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}	
	@RequestMapping("/contact")
	public ModelAndView contactpage(){	
		System.out.println("\nMyController - loginpage");
		ModelAndView mv = new ModelAndView("contactpage");
		return mv;
	}	

	@RequestMapping("/logincheck") // from login.jsp
	public ModelAndView logincheck(@RequestParam(value="userid")String userid,@RequestParam(value="pwd")String passwd) {
		System.out.println("\nMyContoller - logincheck");
		ModelAndView mv;
		System.out.println("\nMyContoller - /loginCheck - before session factory");
		UserDAO ud = new UserDAOimpl(sessionFactory);
		System.out.println("\nMyContoller - /loginCheck - after session factory");
		
		if(ud.isValidUser(userid,passwd)==true && ud.isAdminUser(userid,passwd)==true ) {
			System.out.println("login ok");
			mv=new ModelAndView("admin");
			mv.addObject("username", userid);
			
		}
		else if(ud.isValidUser(userid,passwd)==true) {
			System.out.println("login user ok");
			mv=new ModelAndView("loginSuccessUser");
		}
		else {
			System.out.println("login not ok");			
			mv=new ModelAndView("loginerror");
		}
		return mv;	
			
	}
	@RequestMapping("/homeFromLogin")
	public ModelAndView getHomePage(){	
		System.out.println("\n/ request maped back to welcome from login success");
		ModelAndView mv = new ModelAndView("welcome");
		return mv;
	}
	
	@RequestMapping("/deleteDevice") // from page1.jsp
	public ModelAndView deleteDevice(@RequestParam(value="id")String did) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(did);
		
		System.out.println("\nHomeContoller - deleteDevice - " + did);
		int id = Integer.parseInt(did);
		devserv.deleteDevice(did);
		System.out.println("\nHomeContoller - deleteDevice - " + id + " - completed");
		ModelAndView mv = new ModelAndView("page1");		
		return mv;		
	}
	@RequestMapping("/editDevice") // from page1.jsp
	public ModelAndView editDevice(@RequestParam(value="id")String did, HttpServletRequest request) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(did);
		System.out.println("\nMyContoller - editDevicePage - " + did);
		int id = Integer.parseInt(did);
		//devserv.deleteDevice(id);
		ProductModel nd = new ProductModel();
		Session s = sessionFactory.openSession();
		ModelAndView mv = new ModelAndView("editDevicePage");
		
		ProductModel nd1 = (ProductModel)s.get(ProductModel.class,id);
		HttpSession session = request.getSession();
		session.setAttribute("data", nd1);				
		session.setAttribute("devid",did);
		mv.addObject("devid",did);
		mv.addObject("command",nd1);
		//String str=(String)session.getAtt
		System.out.println("\nMyContoller - editDevicePage - " + id + " - completed");
		return mv;		
	}
	
	@RequestMapping("editProductData")
	public ModelAndView update(@ModelAttribute("abcd")ProductModel p) 
	 {
		devserv.updateDevice(p);
		return new ModelAndView("loginSuccessAdmin");  
	 }
	@RequestMapping("userRegistration1")
	public ModelAndView registerUser(){
		ModelAndView mv = new ModelAndView("userRegistration1");
		
		return mv;
	}

	//registerUser
	@RequestMapping("registerUser")
	public ModelAndView regUser(@RequestParam(value="UserId")String uid,@RequestParam(value="password")String pwd,
    		@RequestParam(value="emailid")String email,@RequestParam(value="mobilenumber")String mobile,
    		@RequestParam(value="address")String addr,@RequestParam(value="city")String cit,
    		@RequestParam(value="state")String st,@RequestParam(value="country")String cnt )
	{
		System.out.println("registeruser");
		UserDetails ud = new UserDetails();
		
		ud.setUserId(uid);
		ud.setPassword(pwd);
		ud.setAdmin(false);
		ud.setStatus("valid");
		ud.setEmailId(email);
		ud.setMobileNo(mobile);
		ud.setAddress(addr);
		ud.setCity(cit);
		ud.setState(st);
		ud.setCountry(cnt);		
		
		UserDAO udao = new UserDAOimpl(sessionFactory);
		udao.addUser(ud);
		
		
		
		return null;
	}
	


}
