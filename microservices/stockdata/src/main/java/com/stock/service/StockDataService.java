package com.stock.service;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.stock.pojo.Stock;

@Service
public class StockDataService implements StockService {
    private final String DATA_IMPORT_PATH = "DataImport";
    private final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy/MM");

    public void importToCsv(String exchange, String companySymbol) {
        String url = buildUrl(exchange, companySymbol);
        List<Stock> stockDataList = fetchStockData(url);
        String folderPath = buildFolderPath(exchange, companySymbol);
        String fileName = buildFileName(exchange, companySymbol);
        saveToCsv(stockDataList, folderPath, fileName);
    }

    private String buildUrl(String exchange, String companySymbol) {
        String url = "https://api.thirdparty.com/" + exchange + "/" + companySymbol;
        // Code to fetch data from third-party endpoint
        return url;
    }

    private List<Stock> fetchStockData(String url) {
        // Code to fetch data from third-party endpoint
        return new ArrayList<>(); // Return empty list for demo purpose
    }

    private String buildFolderPath(String exchange, String companySymbol) {
        String yearMonth = LocalDate.now().format(DATE_FORMAT);
        String folderPath = DATA_IMPORT_PATH + "/" + exchange + "/" + companySymbol + "/" + yearMonth;
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return folderPath;
    }

    private String buildFileName(String exchange, String companySymbol) {
        String currentDate = LocalDate.now().toString();
        String uniqueId = generateUniqueId(currentDate, exchange, companySymbol);
        return "stockdata_" + uniqueId + ".csv";
    }

    private String generateUniqueId(String date, String exchange, String companySymbol) {
        String strToEncode = date + exchange + companySymbol;
//        return (String)DigestUtils.md5Digest(strToEncode);
        return DigestUtils.md5DigestAsHex(strToEncode);
    }

    private void saveToCsv(List<Stock> stockDataList, String folderPath, String fileName) {
//        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter(folderPath + "/" + fileName), CSVFormat.DEFAULT.withHeader("stock"))){
//        	
//        }
//        catch(Exception e) {
//        	e.printStackTrace();
//        }
    }

	@Override
	public Stock getSingle() {
		return null;
	}
}