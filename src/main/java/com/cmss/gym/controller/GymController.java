package com.cmss.gym.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cmss.gym.bean.GymBean;
import com.cmss.gym.bean.RegistrationBean;
import com.cmss.gym.service.gymservice;






@Controller
public class GymController {

	@Autowired 
	gymservice service;
	boolean res;

	/*@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {  
		String message = request.getParameter("gymName");  
		return new ModelAndView("home", "msg", message);  
	}  */

	/*@RequestMapping(value="/enquiry",method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView enquiry(@ModelAttribute("gaugeCategoryForm") GymBean bean,HttpServletRequest request,HttpServletResponse response) {  
		System.out.println("--------------inside---enquiry---------");
		System.out.println("----username--"+bean.getUsername()+"--- mobile---"+bean.getMobile());
		//res=service.addenquiry(bean);
		return new ModelAndView("welcome");  
	}  */
	// save check 
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("register") RegistrationBean bean,HttpServletRequest request,HttpServletResponse response) {
		
		if (bean.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			service.addreg(bean);
		} else {
			service. updatereg(bean);
		}
		return new ModelAndView("welcome");
	} 
	//view
	@RequestMapping(value="/regview")
	public ModelAndView regview(ModelAndView model,HttpServletRequest request,HttpServletResponse response) {  
		List<RegistrationBean> listEmployee = service.getAllregistration();
		System.out.println("----------regview----------");
		model.addObject("listreg", listEmployee);
		//model.setViewName("home");
		return new ModelAndView("regview", "msg", listEmployee); 
	}
	
	//update
	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		RegistrationBean employee =service.regupdate(id);
		System.out.println("check-   :"+employee.getName());
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("registration", employee);
		System.out.println("update"+model.getViewName());
		return model;
	}
	//delete 
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("----------------id=="+id);
		service.deleteUser(id);
		return new ModelAndView("redirect:/");
	}
	//insert
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		RegistrationBean employee = new RegistrationBean();
		model.addObject("registration", employee);
		model.setViewName("welcome");
		return model;
	}
//save
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute RegistrationBean bean) {
		System.out.println("---------idd---------------"+bean.getId());
		if (bean.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			service.addreg(bean);
			System.out.println("add");
		} else {
			service.updatereg(bean);
		}
		return new ModelAndView("redirect:/");
	}
}


