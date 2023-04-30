package com.jspider.main;

import com.jspider.builderclass.LaptopBuilder;
import com.jspider.classb.Laptop;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		Laptop laptop = new LaptopBuilder().company("Lenovo").ram(8).price(48000.00)
				.displaySize(15.5).graphicalCard(4).warranty(2.5)
				.discount(25).getLaptop();
		
		System.out.println(laptop);
		
	}
}
