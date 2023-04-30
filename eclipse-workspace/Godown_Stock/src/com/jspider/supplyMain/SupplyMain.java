package com.jspider.supplyMain;

import com.jspider.customers.Customer1;
import com.jspider.customers.Customer2;
import com.jspider.godown.Godown;
import com.jspider.supplier.Supplier;

public class SupplyMain {
	public static void main(String[] args) {
		Godown godown = new Godown(100);
		Customer1 cust1 = new Customer1(godown);
		Customer2 cust2 = new Customer2(godown);
		Supplier supply = new Supplier(godown);
		
		cust1.start();
		cust2.start();
		supply.start();
		
		
		System.out.println(args);
	}
}
