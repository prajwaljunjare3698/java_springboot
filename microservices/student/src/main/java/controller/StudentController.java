package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import pojo.StudentPojo;
import response.StudentResponse;
import service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public ResponseEntity<StudentResponse> add(@RequestBody StudentPojo student){
		StudentPojo pojo = service.add(student);
		if(pojo!=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK",HttpStatus.ACCEPTED, pojo, null),HttpStatus.ACCEPTED);
		}				
		return new ResponseEntity<StudentResponse>(new StudentResponse("failed",HttpStatus.BAD_REQUEST, pojo, null),HttpStatus.BAD_REQUEST);
	}
	
//	@GetMapping("/get")
//	public StudentResponse
}
