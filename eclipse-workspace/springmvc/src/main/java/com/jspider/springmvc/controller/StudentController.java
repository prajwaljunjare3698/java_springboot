package com.jspider.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspider.springmvc.pojo.StudentPojo;
import com.jspider.springmvc.service.StudentService;

@Controller
public class StudentController {

//	@Autowired
//	private StudentService service;
//	private static String userName = null;
//	private static String passWord = null;
//
//	@GetMapping("/homepage")
//	public String home(ModelMap map) {
//		if(userName!=null && passWord!=null) {			
//			return "homepage";
//		}
//		map.addAttribute("verify", "login first..!");
//		return "login_form";
//	}
//
//	@PostMapping("/login")
//	public String loginform(@RequestParam String username,@RequestParam String password,ModelMap map) {
//		StudentPojo pojo = service.login(username,password);
//	
//		if(pojo != null) {
//			
//			userName = username;
//			passWord = password;
//			
//			return "homepage";
//		}
//		map.addAttribute("msg","Invalid username/password...");
//		return "login_form";
//	}
//
//	@GetMapping("/add")
//	public String add(ModelMap map) {
//		if(userName!=null && passWord!=null) {			
//			return "add_student";
//		}
//		map.addAttribute("verify", "login first..!");
//		return "login_form";
//	}
//	
//	@PostMapping("/add")
//	public String addData(@RequestParam String name,@RequestParam String email,@RequestParam long contact,@RequestParam String city,@RequestParam String username,@RequestParam String password,ModelMap map) {
//		StudentPojo student = service.add(name, email,contact, city, username, password);
//		if (student != null) {
//			map.addAttribute("student", student);
//		} else {
//			map.addAttribute("msg", "Data not added.!");
//		}
//		return "add_student";
//	}	 
//	
//	
//	@GetMapping("/search")
//	public String search(ModelMap map) {
//		if(userName!=null && passWord!=null) {			
//			return "search_student";
//		}
//		map.addAttribute("verify", "login first..!");
//		return "login_form";
//	}
//	@PostMapping("/search")
//	public String searchData(@RequestParam int id,
//			ModelMap map) {
//		StudentPojo student = service.search(id);
//		if (student != null) {
//			map.addAttribute("student", student);
//		} else {
//			map.addAttribute("msg", "Data not found..!!");
//		}
//		return "search_student";
//	}
//	
//	
//	
//	@GetMapping("/remove")
//	public String remove(ModelMap map) {
//		if(userName!=null && passWord!=null) {			
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);			
//			return "remove_student";
//		}
//		
//		map.addAttribute("verify", "login first..!");	
//		return "login_form";
//	}
//	@PostMapping("/remove")
//	public String removeData(@RequestParam int id,
//			ModelMap map) {
//		StudentPojo student = service.search(id);
//				
//		if (student != null) {
//			StudentPojo std = service.remove(id);
//			
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);
//			map.addAttribute("msg", "student removed..!!");
//			
//		} else {
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);
//			map.addAttribute("msg", "Data not found..!!");
//		}
//		return "remove_student";
//	}
//	
//	
//	
//	
//	
//	
//	@GetMapping("/update")
//	public String update(ModelMap map) {
//		
//		if(userName!=null && passWord!=null) {
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);			
//			return "update_student";
//		}
//		map.addAttribute("verify", "login first..!");	
//
//		return "login_form";
//	}
//	
//	@PostMapping("/update")
//	public String updateForm(@RequestParam int id,
//			ModelMap map) {
//		StudentPojo student = service.search(id);
//		if (student != null) {
//			map.addAttribute("student", student);
//		} else {
//			map.addAttribute("msg", "Data not found..!!");
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);
//		}
//		return "update_student";
//	}
//	
//	@PostMapping("/updateData")
//	public String updateData(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam long contact,@RequestParam String city,@RequestParam String username,@RequestParam String password,ModelMap map) {
//		StudentPojo student = service.search(id);
//		if (student != null) {
//			service.update(id, name, email, contact,
//					city, username, password);
//			map.addAttribute("msg", "Student updated successfully..!!");
//			List<StudentPojo> students = service.showAll();
//			map.addAttribute("students", students);
//		}
//		return "update_student";
//	}
//	
//	@GetMapping("/logout")
//	public String logout() {
//		userName = null;
//		passWord = null;
//		return "login_form";
//	}	
		
	
	
	
	
	
	
	
	
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/homepage")
	public String home(@SessionAttribute(name = "login", required = false) StudentPojo login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		return "homepage";
	}

	@PostMapping("/login")
	public String login(HttpServletRequest request, @RequestParam String username, @RequestParam String password,
			ModelMap map) {
		
		int no = Integer.parseInt(username); //to generate customized exception
		
		StudentPojo student = service.login(username, password);
		if (student != null) {
			HttpSession session = request.getSession();
			session.setAttribute("login", student);
			session.setMaxInactiveInterval(10);			
			
			return "homepage";
		}
		map.addAttribute("msg", "Inavlid username or password..!!");
		return "login_form";
	}
	
	@GetMapping("/add")
	public String add(@SessionAttribute(name = "login", required = false) StudentPojo login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		return "add_student";
	}
	
	@PostMapping("/add")
	public String addData(@SessionAttribute(name = "login", required = false) StudentPojo login,
			@RequestParam String name, @RequestParam String email, @RequestParam long contact,
			@RequestParam String city, @RequestParam String username, @RequestParam String password, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		StudentPojo student = service.add(name, email, contact, city, username, password);
		if (student != null) {
//			if(student.getName().isBlank()) {
//				return "redirect:/login_form";
//			}
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not added.!");
		}
		return "add_student";
	}

	@GetMapping("/search")
	public String search(@SessionAttribute(name = "login", required = false) StudentPojo login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		return "search_student";
	}

	@PostMapping("/search")
	public String searchData(@SessionAttribute(name = "login", required = false) StudentPojo login,
			@RequestParam int id, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		StudentPojo student = service.search(id);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not found..!!");
		}
		return "search_student";
	}

	@GetMapping("/update")
	public String update(@SessionAttribute(name = "login", required = false) StudentPojo login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "update_student";
	}

	@PostMapping("/update")
	public String updateForm(@SessionAttribute(name = "login", required = false) StudentPojo login,
			@RequestParam int id, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		StudentPojo student = service.search(id);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not found..!!");
			List<StudentPojo> students = service.showAll();
			map.addAttribute("students", students);
		}
		return "update_student";
	}

	@PostMapping("/updateData")
	public String updateData(@SessionAttribute(name = "login", required = false) StudentPojo login,
			@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam long contact,
			@RequestParam String city, @RequestParam String username, @RequestParam String password, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		StudentPojo student = service.search(id);
		if (student != null) {
			service.update(id, name, email, contact, city, username, password);
			map.addAttribute("msg", "Student updated successfully..!!");
			List<StudentPojo> students = service.showAll();
			map.addAttribute("students", students);
		}
		return "update_student";
	}

	@GetMapping("/remove")
	public String remove(@SessionAttribute(name = "login", required = false) StudentPojo login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "remove_student";
	}

	@PostMapping("/remove")
	public String removeData(@SessionAttribute(name = "login", required = false) StudentPojo login,
			@RequestParam int id, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please login to proceed..!!");
			return "login_form";
		}
		StudentPojo student = service.remove(id);
		if (student != null) {
			map.addAttribute("msg", "Student removed successfully");
		} else {
			map.addAttribute("msg", "Data not found..!!");
		}
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "remove_student";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Successfully logged out..!!");
		return "login_form";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String nullPointer() {		
		return "customexception";
	} 
	
}
