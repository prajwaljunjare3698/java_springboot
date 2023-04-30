package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Employee;
import com.app.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/")
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping("/registerPage")
	public String registerPage() {
	
		return "register";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee emp ) {
		System.out.println(emp.getEmpName());
		System.out.println(emp.getUserName());
		int id =	homeService.saveEmployee(emp);
		if(id>0) {
			return "login";
		}else {
			return "register";
		}
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam String userName, @RequestParam String password, ModelMap map) {
	
		System.out.println(userName);
		System.out.println(password);
		List<Employee> empList = new ArrayList<Employee>();
		if(userName.equals("abc") && password.equals("abc123")) {
			 empList =	homeService.getAllEmployee();
			 
			 for(Employee e:empList) {
				 System.out.println(e.getEmpId()+""+e.getEmpName()+""+e.getCityName());
			 }
		}	
		if(!empList.isEmpty() && empList!=null) {
			map.addAttribute("empList", empList);
			return "success";
		}
		else {
			return "login";			
		}
	}
	
	
	@RequestMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId, ModelMap map) {
	
		List<Employee> empList = homeService.deleteEmployee(empId);
		map.addAttribute("empList", empList);
		return "success";
	}
	
	
	@RequestMapping("/edit/{empId}")
	public String editEmployee(@PathVariable("empId") int empId, ModelMap map) {
		
		Employee emp = homeService.editEmployee(empId);
		map.addAttribute("emp", emp);
		return "edit";
	}
	
	
	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp, ModelMap map) {
		
		List<Employee> empList = homeService.updateEmployee(emp);
		
		map.addAttribute("empList",empList );
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
