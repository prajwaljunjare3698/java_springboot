package com.app.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CandleDao;
import com.app.pojos.Candles;

@Service
@Transactional
public class CandleService implements CandleServiceInterface {
	@Autowired
	CandleDao cdao;

	public void addAllCandles(List<Candles> candles) {
		cdao.saveAll(candles);
	}

	public List<Candles> getAllCandles() {
		return cdao.findByOrderByLast();
	}

	@Override
	public List<Candles> getCombined(int time) {
		if (time % 5 != 0 || time < 5) {
			// raise exception for not in time range of min
		}

		// getting all candles in sorted manner
		List<Candles> allcandels = cdao.findByOrderByLast();

		// for returning combined Candles
		List<Candles> combined = new ArrayList<Candles>();

		// number of candles to combine
		int combineNumber = time / 5;

		Candles temp = new Candles(allcandels.get(0));
		Long id = (long) -1;
		long volume = 0;

		int start = 0;
		int next = 0;
		do {
			next = start + combineNumber;
			// combining candles
			List<Candles> sublist = allcandels.subList(start, next > allcandels.size() ? allcandels.size() : next);
			temp = new Candles(sublist.get(0));
			for (Candles candle : sublist) {
				volume += candle.getTradedQty();

				// setting low and High Value

				if (temp.getLow() > candle.getLow()) {
					temp.setLow(candle.getLow());
				}

				if (temp.getHigh() < candle.getHigh()) {
					temp.setHigh(candle.getHigh());
				}
			}
			// setting all other values
			temp.setId(++id);
			temp.setClose(sublist.get(sublist.size() - 1).getClose());
			temp.setTradedQty(volume);
			combined.add(temp);
			volume = 0;
			start = next;
		} while (next < allcandels.size());
		return combined;
	}

	@Override
	public String getOpeningRangeBreakout(int time) {
		// if ORB is not Found
		String orb = "NA";

		// getting all candles in sorted manner
		List<Candles> allcandels = cdao.findByOrderByLast();

		// for returning combined Candles
		List<Candles> rangeOf45 = allcandels.subList(0, 9);

		double high = allcandels.get(0).getHigh();
		double low = allcandels.get(0).getLow();
		for (Candles candle : rangeOf45) {

			// setting low and High Value

			if (low > candle.getLow()) {
				low = candle.getLow();
			}

			if (high < candle.getHigh()) {
				high = candle.getHigh();
			}
		}
		String pattern = "MM-dd-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		
		for (int i = 9; i < allcandels.size(); i++) {

			if (allcandels.get(i).getHigh() > high) {

				orb = simpleDateFormat.format(allcandels.get(i).getLast());
				System.out.println(allcandels.get(i));
				break;
			}

			if (allcandels.get(i).getLow() < low) {

				orb = simpleDateFormat.format(allcandels.get(i).getLast());
				System.out.println(allcandels.get(i));
				break;
			}

		}

		return orb;
	}

}
