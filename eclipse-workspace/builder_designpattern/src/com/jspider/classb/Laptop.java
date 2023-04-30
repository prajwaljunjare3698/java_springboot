package com.jspider.classb;

public class Laptop {

	private String company;
	private int ram;
	private double price;
	private double displaySize;
	private int storageSize;
	private int graphicsCard;
	private double warranty;
	private double discount;
	
	
	public Laptop(String company, int ram, double price, double displaySize, int storageSize, int graphicsCard,
			double warranty, double discount) {
		super();
		this.company = company;
		this.ram = ram;
		this.price = price;
		this.displaySize = displaySize;
		this.storageSize = storageSize;
		this.graphicsCard = graphicsCard;
		this.warranty = warranty;
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Laptop [company=" + company + ", ram=" + ram + ", price=" + price + ", displaySize=" + displaySize
				+ ", storageSize=" + storageSize + ", graphicsCard=" + graphicsCard + ", warranty=" + warranty
				+ ", discount=" + discount + "]";
	}
	
	
	
	

	
	
}
