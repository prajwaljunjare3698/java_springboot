package com.jspider.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springrest.pojo.StudentPojo;
import com.jspider.springrest.repository.StudentRepository;

@Service
public class StudentService {
	 
	@Autowired
	private StudentRepository repository;

	public StudentPojo add(StudentPojo student) {
		StudentPojo pojo = repository.add(student);
		return pojo;
	}
	
	public StudentPojo search(int id) { 
		StudentPojo pojo = repository.search(id);
		return pojo;
	}

	public List<StudentPojo> showAll() {
		List<StudentPojo> students = repository.showAll();
		
		return students;
	}

	public StudentPojo update(StudentPojo student, int id) {
		StudentPojo pojo = repository.update(student,id);
		return pojo;
	}

	public StudentPojo remove(int id) {
		StudentPojo pojo = repository.remove(id);
		return pojo;
	}


}
 