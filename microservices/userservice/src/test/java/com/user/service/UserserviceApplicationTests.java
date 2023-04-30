package com.user.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserserviceApplicationTests {
	
	Calculator calculator = new Calculator();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void checkSum() {
		//expected op
		int expectedResult = 28;
		
		//actual result
		int actualResult = calculator.doSum(10, 18);
		
		assertThat(expectedResult).isEqualTo(actualResult);
	}
	
	@Disabled
	@Test
	void checkProduct() {
		int expected = 20;
		int actual = calculator.doProduct(5, 4);
		
		assertThat(expected).isEqualTo(actual);
	}
	
	@Test
	void checkSame() {
		boolean actulResult = calculator.checkSame(2, 2);
		assertThat(actulResult).isTrue();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
