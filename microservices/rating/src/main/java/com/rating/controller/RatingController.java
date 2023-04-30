package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.Rating;
import com.rating.service.RatingService;


@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService service;
	
	@PostMapping
	public ResponseEntity<Rating>createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createRating(rating));
	}
	
	@GetMapping("{userratingid}")
	public ResponseEntity<List<Rating>>getRatingByUserId(@PathVariable String userratingid){
		return ResponseEntity.status(HttpStatus.OK).body(service.getRatingByUserId(userratingid));
	}
	 
	@GetMapping("{hotelratingid}")
	public ResponseEntity<List<Rating>>getRatingByHotelId(@PathVariable String hotelratingid){
		return ResponseEntity.status(HttpStatus.OK).body(service.getRatingByUserId(hotelratingid));
	}
	@GetMapping
	public ResponseEntity<List<Rating>>getAllRating(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getAllRating());
	}
	
}
