package com.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.pojos.Candles;
import com.app.services.CandleService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
public class StockApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}	
	
	@Bean
	CommandLineRunner runner(CandleService candleService) {
		return args -> {
			// read data from json and write it in H2 database
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Candles>> typeReference = new TypeReference<List<Candles>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/candle.json");
			try {
				List<Candles> candles = mapper.readValue(inputStream,typeReference);
				candleService.addAllCandles(candles);
				System.out.println("Database updated");
			} catch (IOException e){
				System.out.println("Unable to save data: " + e.getMessage());
			}
		
		}; 
	}

	
}
