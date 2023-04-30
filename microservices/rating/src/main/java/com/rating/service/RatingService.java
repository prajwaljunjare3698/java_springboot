package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {

	//create rating
	Rating createRating(Rating rating);
	
	//get all rating by userId
	List<Rating> getRatingByUserId(String userId);
	
	//get all hotel rating
	List<Rating> getRatingByHotelId(String hotelId);
	
	//get all rating
	List<Rating> getAllRating();
	
}
