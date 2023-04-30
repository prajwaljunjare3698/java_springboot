package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pojo.Customer;
import com.shop.service.CustomerService;

@RestController
@RequestMapping("shop")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@PostMapping("/add")
	public ResponseEntity<Customer>addCustomer(@RequestBody Customer customer){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addCust(customer));
	}
	
	@GetMapping("/find")
	public ResponseEntity<Customer>findCustomer(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findCust(id));
	}
	
	@PostMapping("/order{item}")
	public ResponseEntity<Customer>placeOrder(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findCust(id));
	} 
	
	
	
}
