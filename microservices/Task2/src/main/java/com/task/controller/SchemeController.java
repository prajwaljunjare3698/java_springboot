package com.task.controller;



import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.task.model.Scheme;
import com.task.servicei.SchemaInterface;

@RestController
public class SchemeController 
{
	@Autowired
	SchemaInterface schemainterface;
		
	@PostMapping("/save")
    public String saveScheme() throws IOException
	{
		schemainterface.saveScheme();
        return "Data saved Successfully...";
    }
	
	
	@GetMapping("/searchbyname/{schemeName}")
	public Iterable<Scheme> searchSchemeByName(@PathVariable String schemeName)
	{
		Iterable<Scheme> searchSchemeByName = schemainterface.searchSchemeByName(schemeName);
		
		return searchSchemeByName;
	}
	
	
	@PostMapping("/savedata")
	public String savedata() throws IOException
	{
		schemainterface.savedata();
		return "saved.....";
		
	}
	
	
	
	
	
	
	
}
