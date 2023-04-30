package com.app.services;

import java.util.List;

import com.app.pojos.Candles;

public interface CandleServiceInterface {
	void addAllCandles(List<Candles> candles);
	List<Candles> getAllCandles();
	List<Candles> getCombined(int time);
	String getOpeningRangeBreakout(int time);

}
