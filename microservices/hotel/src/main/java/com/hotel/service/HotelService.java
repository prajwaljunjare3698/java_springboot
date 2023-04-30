package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//get single hotel
	Hotel getHotel(String id);
	
	//get all hotel
	List<Hotel> getAllHotel();

	String deleteHotel(String hotelid);

	Hotel changeName(Hotel hotel, String hotelid);

	Hotel updateHotel(Hotel hotel,String hotelid);
}
