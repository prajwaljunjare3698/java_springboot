package com.stock.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EodData {
	@JsonProperty("date")
	private String date;
	@JsonProperty("open")
	private double open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("close")
	private double close;
	@JsonProperty("adjusted_close")
	private double adjustedClose;
	@JsonProperty("volume")
	private long volume;
//	    @JsonProperty("dividend")
//	    private double dividend;
//	    @JsonProperty("split")
//	    private double split;

}
