package com.stock.service;

import org.springframework.stereotype.Service;

import com.stock.pojo.Stock;

@Service
public interface StockService {
	
	//get stock
	Stock getSingle();
	
	//save all
	
}
