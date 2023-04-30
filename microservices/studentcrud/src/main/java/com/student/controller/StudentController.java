package com.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.pojo.StudentPojo;
import com.student.service.StudentService;

@RestController	
@RequestMapping("/std")
public class StudentController {
	
	@Autowired
	@Qualifier("impl1")
	private StudentService service;
	
	@PostMapping("/add")
	private ResponseEntity<StudentPojo>create(@RequestBody StudentPojo student){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.add(student));
	}
	@GetMapping("/all")
	private ResponseEntity<List<StudentPojo>>getAll(){ 
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getAll());
	}
	
	@GetMapping("id/{id}")
	private ResponseEntity<StudentPojo>findById(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.searchId(id));
	}
	//if both method are usig getmaping and only one parameter accepting it will not work
	//so make some change like "id/{id}" and 2nd "name/{name}"
	
	@GetMapping("name/{name}")	
	private ResponseEntity<List<StudentPojo>>findByName(@PathVariable String name){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.searchName(name));
	}
	
	@PutMapping("{id}")
	private ResponseEntity<StudentPojo>update(@RequestBody StudentPojo student,@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.update(student, id));
	}
	
	@DeleteMapping("{id}")
	private ResponseEntity<StudentPojo>remove(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.delete(id));
	}
	
	@PatchMapping("field/{id}")
	private ResponseEntity<StudentPojo>updateField(@RequestBody Map<Object, Object> fields,@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateFiled(fields,id));
	}
	
	
		
}
