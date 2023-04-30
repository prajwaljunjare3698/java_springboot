package com.task.serviceiserviceimpl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.task.model.Meta;
import com.task.model.Scheme;
import com.task.repository.SchemeDetailsRepository;
import com.task.repository.SchemeRepository;
import com.task.servicei.SchemaInterface;

@Service
public class SchemeImpl implements SchemaInterface
{
	@Autowired
	SchemeRepository schemerepository;
	
	@Autowired
	SchemeDetailsRepository schemedetailsrepository;
	
	@Autowired
    private RestTemplate restTemplate;

	@Override
	public void saveScheme() throws IOException
	{
		 ObjectMapper objectMapper = new ObjectMapper();
	        String apiUrl = "https://api.mfapi.in/mf";
	        URL url = new URL(apiUrl);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();
	        InputStream inputStream = (InputStream) connection.getInputStream();
	        List<Scheme> schemelist = objectMapper.readValue(inputStream, new TypeReference<List<Scheme>>() {});
	        schemerepository.saveAll(schemelist);
		
	}


	@Override
	public  Iterable<Scheme> searchSchemeByName(String schemeName)
	{
		 
	Iterable<Scheme> slist= schemerepository.findAllBySchemeName(schemeName);
	return slist;
	
	}


	@Override
	public void savedata() throws  IOException
	{
	
		   ObjectMapper objectMapper = new ObjectMapper();
	        String apiUrl2 = "https://api.mfapi.in/mf/100077";
	        URL url = new URL(apiUrl2);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();
	        InputStream inputStream = (InputStream) connection.getInputStream();
	        
	        ArrayList<Meta> schemedetails = objectMapper.readValue(inputStream,new TypeReference<ArrayList<Meta>>(){});
	           System.out.println(schemedetails);
	        schemedetailsrepository.saveAll(schemedetails );
	
//		 String apiUrl = "https://api.mfapi.in/mf/100077";
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
//        String json = responseEntity.getBody();
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new JavaTimeModule());
//        Meta meta = objectMapper.readValue(json, Meta.class);
//
//        schemedetailsrepository.save(meta);
	}


}


