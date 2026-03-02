package com.lpu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //take request from client and send response to the client(client/browser)
public class MyController {
	
	@RequestMapping("/hi")
	public String takeReqHi() {
		return "page";
	}
	
	@RequestMapping("/login")
	public String getLogin(Model model) {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String getlogout() {
		return "logout";
	}
	
	@RequestMapping("/data")
	public String sendData(Model model) {
		model.addAttribute("name", "raju");
		model.addAttribute("phone", 888);
		return "display";
	}
	
	@RequestMapping("/data1")
	public ModelAndView sendDataTo(ModelAndView mv) {
		mv.addObject("name", "rishi"); //setting data 
		mv.addObject("phone", 999);
		mv.setViewName("display");
		return mv;
	}
	
	
//	//way--1
//	@RequestMapping("/reg")
//	public ModelAndView register(
//			@RequestParam(value = "n") String name, 
//			@RequestParam(value = "p") String phone,
//			@RequestParam(value = "e") String email) {
//		
//		ModelAndView mView = new ModelAndView();
//		mView.addObject("name", name);
//		mView.addObject("phone", phone);
//		mView.addObject("email", email);
//		mView.setViewName("display2");
//		System.out.println(name+" "+phone+" "+email);
//		return mView;
//	}
	
	
	
	@RequestMapping("/register")
	public String regis() {
		return "register";
	}
	//way--2
	@RequestMapping("/reg")
	public ModelAndView register(@ModelAttribute Student s) {
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("name", s.getName());
		mView.addObject("phone", s.getPhone());
		mView.addObject("email", s.getEmail());
		mView.setViewName("display");
		System.out.println(s.getName()+" "+s.getPhone()+" "+s.getEmail());
		return mView;
	}
	
	
	
	@RequestMapping("/vs")
	public String home() {
		return "home";
	}
}
