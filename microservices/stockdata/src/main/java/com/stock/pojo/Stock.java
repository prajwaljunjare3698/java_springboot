package com.stock.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Stock {
	
	@Id
	private String id; 
	private String date;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double adjClose;
    private Integer volume;
	
	
//    : Id, ImportTS, Date,Open,High,Low,Close,Adjusted_close,Volum
//    String Id -> it is a unique key you need to generate using md5 of
//    date+exchange+companySymbol
}
