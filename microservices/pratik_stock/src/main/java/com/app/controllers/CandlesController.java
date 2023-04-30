package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Candles;
import com.app.services.CandleService;

@RestController
@RequestMapping("/candles")
public class CandlesController {
	
	@Autowired
	CandleService candleService;
	
	@GetMapping("/all")
	public List<Candles> getAllCandles(){
		return candleService.getAllCandles();
	}
	
	@PostMapping("/combined")
	public List<Candles> getCombinedCandles(@RequestBody int time){
		return candleService.getCombined(time);
	}
	
	@PostMapping("/orb") 
	public String getORB(@RequestBody int time){		
		return candleService.getOpeningRangeBreakout(time);
			
	}
}
