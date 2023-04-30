package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	//create
	User save(User user);	
	
	//update
	User updateUser(String id);
	
	
	//delete
	User deleteUser(String id);
	
	//get single user
	User getUser(String id);	
	
	//get all user
	List<User> getAllUser();
}
