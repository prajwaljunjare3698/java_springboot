package com.student.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.student.pojo.StudentPojo;


public interface StudentService {
	
	//add
	StudentPojo add(StudentPojo student);
	
	//find by id 
	StudentPojo searchId(int id);
	
	//find by name
//	@Query("from StudentPojo where name="+name+"")
	List<StudentPojo> searchName(String name);
	
	//update
	StudentPojo update(StudentPojo student,int id);
	
	//delete
	StudentPojo delete(int id);
	
	List<StudentPojo> getAll();

	StudentPojo updateFiled(Map<Object, Object> fields, int id);
}
