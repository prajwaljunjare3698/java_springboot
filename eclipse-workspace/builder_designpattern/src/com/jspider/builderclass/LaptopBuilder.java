package com.jspider.builderclass;

import com.jspider.classb.Laptop;

public class LaptopBuilder {
	
	private String company;
	private int ram;
	private double price;
	private double displaySize;
	private int storageSize;
	private int graphicsCard;
	private double warranty;
	private double discount;
	
	
	
	public LaptopBuilder company(String company) {
		this.company = company; 
		return this;
	}
	
	public LaptopBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public LaptopBuilder price(double price) {
		this.price = price;
		return this;
	}
	
	public LaptopBuilder displaySize(double displaySize) {
		this.displaySize = displaySize;
		return this;
	}
	
	public LaptopBuilder graphicalCard(int graphicsCard) {
		this.graphicsCard = graphicsCard;
		return this;
	}
	
	public LaptopBuilder warranty(double warranty) {
		this.warranty = warranty;
		return this;
	}
	
	public LaptopBuilder discount(double discount) {
		this.discount = discount;
		return this;
	}
		
	
	public Laptop getLaptop() {
		Laptop laptop = new Laptop(this.company, this.ram, this.price, 
				this.displaySize, this.storageSize, this.graphicsCard, 
				this.warranty, this.discount);
			
		return laptop;
	}

	
}
