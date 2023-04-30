package com.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.entity.User;
import com.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	//create
	@PostMapping("/add")
	public ResponseEntity<User>createUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user));
	}
	
	//get user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
		User user = service.getUser(userId);
		
		return ResponseEntity.ok(user);		
	}
	//get all user
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUser(){
		
		System.out.println("getalluser");
		
//		List<User> allUser = service.getAllUser();
//		return ResponseEntity.ok(allUser);
		
		return ResponseEntity.ok(service.getAllUser());
	}
	
	@GetMapping("/akash")
	public ResponseEntity<Map<Integer, String>> getData(){
		return ResponseEntity.ok(Map.of(2,"akash"));
	}
}
