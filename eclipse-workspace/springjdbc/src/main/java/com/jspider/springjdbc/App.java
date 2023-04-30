package com.jspider.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args ){
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/jspider/springjdbc/studentconfig.xml");
   
    	JdbcTemplate template = (JdbcTemplate) context.getBean("template");
    	
    	String query = "insert into student(id,name,city)values(?,?,?)";
    	int update = template.update(query,1,"akash","lonar");
    	
    	System.out.println(update+" executed in db");
    	
    	((ClassPathXmlApplicationContext)context).close();
    
    }                                  
}                              
