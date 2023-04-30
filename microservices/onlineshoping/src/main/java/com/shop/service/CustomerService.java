package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.pojo.Customer;

@Service
public interface CustomerService {

	Customer addCust(Customer customer);
	
	Customer findCust(int id);
}
