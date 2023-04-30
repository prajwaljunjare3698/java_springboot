package com.app.client;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.serviceimple.Homeservice;

@Controller
public class Home_controller {
	
	@Autowired
	Homeservice hs;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/regi")
	public String register() {
		return "registration";
	}
	
	@RequestMapping("regi")
	public String savedata(@ModelAttribute User user,ModelMap map ) {
				
		System.out.println(user.getName());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		int id=hs.savedata1(user);
		
		if(id>0) {
			map.addAttribute("user added");
			return "login";
		}
		else {
			return "registration";
		}
}
	
	
	
}
