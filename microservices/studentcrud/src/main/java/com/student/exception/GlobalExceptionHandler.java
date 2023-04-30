package com.student.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotel.exception.ResourceNotFoundException;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>>resourceNotFound(ResourceNotFoundException e){
		Map<String,Object>map = new HashMap<>();
		map.put("msg", e.getMessage());
		map.put("success", false);
		map.put("status", HttpStatus.NOT_FOUND);		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
}
