package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@PostMapping
	public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(hotel));
	}
	
	@GetMapping("{hotelId}")
	public ResponseEntity<Hotel>getHotel(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(service.getHotel(hotelId));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>>getAllHotel(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllHotel());
	}
	
	@PostMapping("{hotelid}")
	public ResponseEntity<String>deleteHotel(@PathVariable String hotelid){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.deleteHotel(hotelid));
	}
	
	@PutMapping("{hotelid}")
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel, @PathVariable String hotelid){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateHotel(hotel,hotelid));
	}
	
	@PatchMapping("{hotelid}")
	public ResponseEntity<Hotel>changeName(@RequestBody Hotel hotel,@PathVariable String hotelid){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.changeName(hotel,hotelid));
	}	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
