package com.jspider.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.springrest.pojo.StudentPojo;
import com.jspider.springrest.response.StudentResponse;
import com.jspider.springrest.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(path = "/add",
			consumes = { MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> add(@RequestBody StudentPojo student) {         
		StudentPojo pojo = service.add(student);
		StudentResponse response = new StudentResponse();
		if (pojo != null) {                     
			response.setMsg("OK");                                          
			response.setDescription("Student added successfully..!!");
			response.setStudent(student);
			return new ResponseEntity<StudentResponse>(response, HttpStatus.ACCEPTED);
		}
		response.setMsg("FAIL");
		response.setDescription("Student not added..!!");
		return new ResponseEntity<StudentResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(path = "/search{id}",consumes = { MediaType.APPLICATION_JSON_VALUE },produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> 
		search(@PathVariable int id){
		StudentPojo pojo = service.search(id);
		if (pojo != null) {
			return new ResponseEntity<StudentResponse>
			(new StudentResponse
			("OK", "Student Data Found..!!", pojo, null),
					HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>
		(new StudentResponse 
		("FAIL", "Student Not Found", null, null),
				HttpStatus.BAD_REQUEST);
	}

	
	@GetMapping(path = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<StudentResponse>update(){
		 
		List<StudentPojo> students = service.showAll();		
		if(students != null) { 
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Students are...", null, students), HttpStatus.ACCEPTED);
		}		
		return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Students are not found...", null, students), HttpStatus.NOT_FOUND);
	}	
	
	@GetMapping(path = "/update{id}",
			consumes = { MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<StudentResponse> update(@PathVariable int id){
		StudentPojo pojo = service.search(id);
		if (pojo != null) { 
			return new ResponseEntity<StudentResponse>
			(new StudentResponse("OK", "Student Data Found..!!", pojo, null),HttpStatus.FOUND);
		}
		return new ResponseEntity<StudentResponse>
		(new StudentResponse("FAIL", "Student Not Found", null, null),HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(path = "/update{id}",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<StudentResponse> updateStudent(@RequestBody StudentPojo student,@PathVariable int id){
		StudentPojo pojo = service.update(student,id);
		if(pojo != null) {
			return new ResponseEntity<StudentResponse>
			(new StudentResponse("ok","student updated...",pojo,null),HttpStatus.ACCEPTED);
		}
				
		return new ResponseEntity<StudentResponse>(new StudentResponse("failed","not update",null,null),HttpStatus.BAD_REQUEST);
		
	}
	@GetMapping(path = "/remove",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<StudentResponse> remove(){
		
		List<StudentPojo>students = service.showAll();
		
		if(students != null) {
			return new ResponseEntity<StudentResponse>
			(new StudentResponse("ok","students are....",null,students),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>
		(new StudentResponse("failed","not available",null,null),HttpStatus.BAD_REQUEST);
		
	}
	@PostMapping(path = "/remove{id}",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<StudentResponse> remove(@PathVariable int id){
		StudentPojo pojo = service.remove(id);
		if(pojo != null) {
			StudentResponse response = new StudentResponse();
			response.setMsg("ok");
			response.setDescription("student deleted");
			response.setStudent(pojo);
			return new ResponseEntity<StudentResponse>(response,HttpStatus.ACCEPTED);
		}
		StudentResponse response = new StudentResponse();
		response.setMsg("failed");
		response.setDescription("student not found");
		response.setStudent(null);
		return new ResponseEntity<StudentResponse>(response,HttpStatus.BAD_REQUEST);
		
	
	}
	  
	                          
	
	
}
