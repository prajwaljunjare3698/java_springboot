package com.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
	
//	custom method 
	
//	get rating by userId
	List<Rating> getRatingByUserId(String userId);
	
//	get rating by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
