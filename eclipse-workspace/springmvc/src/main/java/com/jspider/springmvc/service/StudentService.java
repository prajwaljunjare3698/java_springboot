package com.jspider.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvc.pojo.StudentPojo;
import com.jspider.springmvc.repository.StudentRepository;

@Service
public class StudentService {
	 
	@Autowired
	private StudentRepository repository;

	public StudentPojo login(String username, String password) {
		StudentPojo pojo = repository.login(username, password);
		return pojo;
	}
	
	public StudentPojo add(String name, String email, long contact, String city, String username, String password) {
		
		StudentPojo pojo = repository.add(name,email,contact,city,username,password);
				
		return pojo;
	}

	public StudentPojo search(int id) {
		StudentPojo pojo = repository.search(id);		 
		return pojo;
	} 
 

	public List<StudentPojo> showAll() {
		List<StudentPojo> pojos = repository.showAll();
		return pojos;
	} 

	public StudentPojo remove(int id) {
		StudentPojo pojo = repository.remove(id);
		return pojo;
	}

	public void update(int id, String name, String email, long contact, String city, String username, String password) {
		repository.update(id,name,email,contact,city,username,password);
	}


}
 