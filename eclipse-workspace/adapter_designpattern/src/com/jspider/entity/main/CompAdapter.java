package com.jspider.entity.main;

import com.jspider.entity.one.Employee;
import com.jspider.entity.second.CompanyEvents;

public class CompAdapter extends Employee implements CompanyEvents {
	static CompAdapter adapter = new CompAdapter();
	
	public static void main(String[] args) {
		adapter.womensDay();
	}
	public void womensDay() {
		adapter.setId(2);
		adapter.setName("bala");
		adapter.setEmail("bala23@gmail.com");
		System.out.println("manager of emp is "+adapter.getName());
	}
}
