package com.app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonProperty("LastTradeTime")
	@JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss", timezone = "GMT+0530")
	private Date last;
	@JsonProperty("QuotationLot")
	private long quotationLot;
	@JsonProperty("TradedQty")
	private long tradedQty;
	@JsonProperty("OpenInterest")
	private double openInterest;
	@JsonProperty("Open")
	private double open;
	@JsonProperty("High")
	private double high;
	@JsonProperty("Low")
	private double low;
	@JsonProperty("Close")
	private double close;

	public Candles(Candles candle) {
		id = candle.getId();
		last = candle.getLast();
		quotationLot = candle.getQuotationLot();
		tradedQty = candle.getTradedQty();
		openInterest = candle.getOpenInterest();
		open = candle.getOpen();
		high = candle.getHigh();
		low = candle.getLow();
		close = candle.getClose();
	}
}
