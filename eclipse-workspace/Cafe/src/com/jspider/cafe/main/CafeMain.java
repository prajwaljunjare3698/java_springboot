package com.jspider.cafe.main;

import java.util.Scanner;

import com.jspider.fastfood.FastFood;
import com.jspider.foodsclass.Burger;
import com.jspider.foodsclass.ColdCoffee;
import com.jspider.foodsclass.Fries;
import com.jspider.foodsclass.Pasta;
import com.jspider.foodsclass.Pizza;

public class CafeMain {
	static FastFood f;
	static boolean loop = true;
	public static void main(String[] args) {
		while(loop) {
			try {
				customerOrder().orderFood();
			} catch (Exception e) {
				System.out.println("customer order nothing");
			}
		}
	}
	private static FastFood customerOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select your order->\n 1:Pizza \n 2:Burder \n 3:Pasta \n 4:Fries \n 5:ColdCoffee");
		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1: {
			f = new Pizza();
			loop = false;
			return f;
		}
		case 2: {
			f = new Burger();
			loop = false;
			return f;
		}
		case 3: {
			f = new Pasta();
			loop = false;
			return f;
		}
		case 4: {
			f = new Fries();
			loop = false;
			return f;
		}
		case 5: {
			f = new ColdCoffee();
			loop = false;
			return f;
		}
		default:
			System.out.println("invalid input");
			loop  = false;
			return f;
		}
	}
}
