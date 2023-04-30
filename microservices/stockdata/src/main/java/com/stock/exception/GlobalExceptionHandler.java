
package com.stock.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFound.class)
	public ResponseEntity<Map<String,Object>>resourceNotFound(ResourceNotFound resource){
		Map<String, Object>map = new HashMap<>();
		map.put("not found", resource);
		map.put("status", HttpStatus.NOT_FOUND);
		map.put("message", resource.getMessage());
		return ResponseEntity.ok(map);
	}
}
