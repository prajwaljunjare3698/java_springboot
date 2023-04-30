package com.stock.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVWriter;
import com.stock.service.StockService;

@RestController
@RequestMapping("eodhistoricaldata.com/api/eod")
public class StockController {
	
	@Autowired
	private StockService service;
//	
//	https://eodhistoricaldata.com/api/eod/{company.exchange}?api_token=63ef56d24343a3.83583376
    private static final String API_KEY = "6419d656930212.90706210";
    private static final String API_URL = "https://eodhistoricaldata.com/api/eod/AAPL.US";

    @GetMapping("/{name}stock")
    public ResponseEntity<String> getStockData() {
        try {
            // Make HTTP request to third-party API
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(API_URL + "?api_token=" + API_KEY);
            String responseString = EntityUtils.toString(httpClient.execute(request).getEntity());

            // Write response to CSV file
            String[] responseLines = responseString.split("\\r?\\n");
            CSVWriter writer = new CSVWriter(new FileWriter("data/stocks.csv"));
            for (String line : responseLines) {
                String[] fields = line.split(",");
                writer.writeNext(fields);
            }
            writer.close();

            return new ResponseEntity<>("Stock data saved to CSV file", HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Error saving stock data to CSV file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
