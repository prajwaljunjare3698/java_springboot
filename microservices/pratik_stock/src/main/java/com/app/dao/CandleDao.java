package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Candles;

public interface CandleDao extends JpaRepository<Candles, Long> {

	List<Candles> findByOrderByLast();
}
