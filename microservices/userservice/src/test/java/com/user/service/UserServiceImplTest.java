package com.user.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.entity.User;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	UserServiceImpl service;
	
	static int count = 0;
	
	@Test
	void testSave() {
		User user = new User("asdf", "akash","akash@gmial.com","cool guy",null );
		service.save(user);
	}

	@Test
	void testGetUser() {		
		User user = service.getUser("6f5140cc-e870-4e54-8f39-6447c88b8344");
		assertThat(user).isNotNull();
		
	}

	@Test
	void testGetAllUser() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUser() {
		fail("Not yet implemented");
	}
	
	//this method execute before every test method
//	@BeforeEach
//	void beforeTests() {
//		System.out.println("count before "+ ++count);
//	}
////	this method execute after every test method
//	@AfterEach
//	void afterTests() {
//		System.out.println("count after "+ count--);
//	}
	
//	@BeforeAll
//	void beforeAll() {
//		System.out.println("count before "+ ++count);
//	}
	@AfterAll
	void afterAll() {
		System.out.println("count after "+ ++count);
	}

}
