package oops_pro;

public class Car_data {
	String car_model;
	String car_name;
	String car_owner;
	double car_price;
	
	Car_data(String a,String b,String c,double d){
		car_model = a;
		car_name = b;
		car_owner = c;
		car_price = d;
	}
	public void show() {
		System.out.println(car_name);
		System.out.println(car_model);
		System.out.println(car_price);
		System.out.println(car_owner);
	}
	
}
