package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);
		
		
}
	
	@Bean
	public RestTemplate rt()
	{
		return new RestTemplate();
	}
	

}
