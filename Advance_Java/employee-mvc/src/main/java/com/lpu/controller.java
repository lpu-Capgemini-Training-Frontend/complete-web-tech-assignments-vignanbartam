package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Component
public class controller {
	@Autowired
	private Dao d;

	
	@RequestMapping("/reg")
	public String regi(Model m) {
		m.addAttribute("e", new Employee());
		return "register";
	}
	
	@RequestMapping("/save")
	public String regis(@ModelAttribute("e") Employee e) {
		
		d.addRegister(e);
		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("id", e.getId());
//		mv.addObject("name", e.getName());
//		mv.addObject("phone", e.getPhone());
//		mv.addObject("email", e.getEmail());
//		mv.setViewName("displayAll");
		
		return "redirect:/displayAll";
	}
	
	@RequestMapping("/displayAll")
	public String findall(Model model) {
		model.addAttribute("list", d.findallEmployee());
		return "displayAll";
	}
	
	@RequestMapping("/edit")
	public String editEmp(@RequestParam("id") int id, Model model) {
		model.addAttribute("e", d.findEmployee(id));
		return "update";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("e") Employee e) {
		d.updateEmployee(e);
		return "redirect:/displayAll";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		d.deleteEmployee(id);
		return "redirect:/displayAll";
	}
}
