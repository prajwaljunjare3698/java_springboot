package com.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.pojo.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {

}
