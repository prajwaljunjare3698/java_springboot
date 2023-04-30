package com.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.shop.exception.ResourceNotFoundException;
import com.shop.pojo.Customer;
import com.shop.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository repository;

	@Override
	public Customer addCust(Customer customer) {
		Customer cust = repository.save(customer);
		return cust;
	}

	@Override
	public Customer findCust(int id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("not found"));
	}
	
	
}
