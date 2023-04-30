package com.hotel.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl1 implements HotelService {

	@Autowired
	HotelRepository repository;
	
	@Bean
	@Primary
	private HotelServiceImpl1 getHotelServiceImpl1() {
		HotelServiceImpl1 obj = new HotelServiceImpl1();
		return obj;
	}
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		Hotel save = repository.save(hotel); 
		System.out.println("save running");
		return save;
	}

	@Override
	public Hotel getHotel(String id) {
//		Hotel hotel = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found"));
//		return hotel;
		Optional<Hotel> hotel = repository.findById(id);
		if(hotel.isPresent()) {
			return hotel.get();
		}
		throw new ResourceNotFoundException("not found");
	}

	@Override
	public List<Hotel> getAllHotel() {
		List<Hotel> allHotel = repository.findAll();	
		return allHotel;
	}

	@Override
	public String deleteHotel(String hotelid) {
		Hotel hotel = repository.findById(hotelid).get();
		if(hotel!=null) {
			repository.deleteById(hotelid);
			return "hotel deleted successfully...";
		}
		return null;
	}

	@Override
	public Hotel updateHotel(Hotel newHotel,String hotelid) {
		Hotel existHotel = repository.findById(hotelid).orElseThrow(()-> new ResourceNotFoundException("not found"));
		existHotel.setName(newHotel.getName());
		existHotel.setLocation(newHotel.getLocation());
		existHotel.setAbout(newHotel.getAbout());		
		return repository.save(existHotel);
	}
	
	@Override
	public Hotel changeName(Hotel hotel,String hotelid) {
		Hotel existHotel = repository.findById(hotelid).orElseThrow(()-> new ResourceNotFoundException("not found"));
		if(hotel.getName()==null) {
			existHotel.setName(existHotel.getName());
		}
		else {
			existHotel.setName(hotel.getName());
		}
		if(hotel.getLocation()==null) {
			existHotel.setLocation(existHotel.getLocation());
		}
		else {
			existHotel.setLocation(hotel.getLocation());
		}
		if(hotel.getAbout()==null) {
			existHotel.setAbout(existHotel.getAbout());
		}
		else {
			existHotel.setAbout(hotel.getAbout());
		}
		
		return repository.save(existHotel);
	} 
	static {
		System.out.println("bean-1");
	}


}
