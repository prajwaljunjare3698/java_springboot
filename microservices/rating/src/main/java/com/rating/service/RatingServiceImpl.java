package com.rating.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository repository;
	
	@Override
	public Rating createRating(Rating rating) {
		//generating random ratingId
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return repository.save(rating);
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repository.getRatingByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return repository.getRatingByHotelId(hotelId);
	}

	public List<Rating> getAllRating() {
		return repository.findAll();
	}

	
}
