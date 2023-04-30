package com.user.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.exception.ResourceNotFound;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public User save(User user) {
		//generate uniq user id
		String userId = UUID.randomUUID().toString();
		user.setId(userId);
		User save = repository.save(user);
		return save;
	}
	
	@Override
	public User getUser(String id) {
		int userId = Integer.parseInt(id);
		User user = repository.findById(userId).orElseThrow(()-> new ResourceNotFound("id not found on server"+id));
		return user;
	}
	
	@Override
	public List<User> getAllUser() {
		List<User> allUser = repository.findAll();
		return allUser;
	}

	@Override
	public User updateUser(String id) {
		
		return null;  	
	}

	@Override
	public User deleteUser(String id) {
		User user = getUser(id);
		if(user!=null) {
			repository.delete(user);
			return user;
		}
		return user;
	}
}
