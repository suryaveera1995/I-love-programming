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
import com.niit.application.model.SupplierModel;
import com.niit.application.service.CategoryService;
import com.niit.application.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierserv;
	@Autowired
	private SessionFactory sessionFactory;  
	String setName = "";
	@RequestMapping("/addSup") // from admin.jsp
	public ModelAndView addSupplier() {
		System.out.println("in add supplier controller");
		System.out.println("\nMyContoller - addsupplier");
		ModelAndView mv = new ModelAndView("addSupplier");
		return mv;
		//return null;
	}
	
	@RequestMapping("/addSupplier") // from addSupplier.jsp
    public ModelAndView storeProduct(@RequestParam(value="SupplierId")String sid,
    		@RequestParam(value="SupplierName")String sn,
    		@RequestParam(value="SupplierPhoneNo")String sp,
    		@RequestParam(value="SupplierDetails")String sdet)
    		
    {
    	System.out.println("In Add Supplier method : " + sn );
    	SupplierModel s = new SupplierModel();
    	s.setSupplierId(Integer.parseInt(sid));
    	s.setSupplierName(sn);
    	s.setSupplierPhoneNo(sp);
    	s.setSupplierDetails(sdet);
    	 	
    	//System.out.println("test:"+p.getDeviceName());
    	
    	supplierserv.addSupplier(s);
    	return new ModelAndView("success");
    	
    }
	
	@RequestMapping("/viewsupplier") // from admin.jsp
	public ModelAndView viewsuppliers()
	{
		List<SupplierModel> arr=supplierserv.getSupplierList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("supplierlist","data",gson.toJson(arr));
	}
	@RequestMapping("/deleteSupplier") // from admin.jsp
	public ModelAndView deleteSupplier(@RequestParam(value="id")String sid) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(sid);
		
		System.out.println("\nSupplierContoller - deleteSupplier - " + sid);
		int id = Integer.parseInt(sid);
		supplierserv.deleteSupplier(sid);
		System.out.println("\nsupplierContoller - deleteSupplier - " + id + " - completed");
		ModelAndView mv = new ModelAndView("deletesuccess");		
		return mv;		
	}
	@RequestMapping("/editSupplierPage") // from supplierlist.jsp
	public ModelAndView editSupplier(@RequestParam(value="id")String sid, HttpServletRequest request) {
	//	System.out.println("id:"+req.getParameter("DeviceId"));
		System.out.println(sid);
		System.out.println("\nMyContoller - editSupplierPage - " + sid);
		int id = Integer.parseInt(sid);
		//devserv.deleteDevice(id);
		SupplierModel nd = new SupplierModel();
		Session s = sessionFactory.openSession();
		ModelAndView mv = new ModelAndView("editSupplierPage");
		
		SupplierModel nd1 = (SupplierModel)s.get(SupplierModel.class,id);
		HttpSession session = request.getSession();
		session.setAttribute("data", nd1);				
		session.setAttribute("devid",sid);
		mv.addObject("devid",sid);
		mv.addObject("command",nd1);
		//String str=(String)session.getAtt
		System.out.println("\nMyContoller - editSupplierPage - " + id + " - completed");
		return mv;		
	}
	
	@RequestMapping("editSupplierData")
	public ModelAndView update(@ModelAttribute("application")SupplierModel s) 
	 {
		supplierserv.updateSupplier(s);
		return new ModelAndView("success");  
	 }
}
