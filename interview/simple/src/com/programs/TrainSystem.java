package com.programs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookTicket{
	private int no;
	private String from;
	private String destination;
	private LocalDate date;
	private int seatNo;
	public BookTicket(int no, String destination, LocalDate date, int seatNo) {
		super();
		this.no = no;
		this.destination = destination;
		this.date = date;
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "BookTicket [no=" + no + ", destination=" + destination + ", date=" + date + ", seatNo=" + seatNo + "]";
	}
}
class Passenger{
	private String name;
	private int age;
	private String gender;
	private int seatNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + ", seatNo=" + seatNo + "]";
	}
}
class Train{
	private int trainNo;

	public Train(int trainNo) {
		super();
		this.trainNo = trainNo;
	}
	
}
public class TrainSystem {
	public static void main(String[] args) {
		List<Passenger>passengerList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		while(true) {
			System.out.println("select option");
			System.out.println("1.add passenger \n2.book ticket\n3.cancel ticket\n4.change reservation\n5.change boarding\n6.exit");
			switch (choice) {
				case 1: {
					Passenger p = new Passenger();
					System.out.println("enter passenger name");
					p.setName(sc.nextLine());
					System.out.println("enter passenger age");
					p.setAge(sc.nextInt());
					System.out.println("enter passenger gender");
					p.setGender(sc.next());
					System.out.println("enter passenger seatno");
					p.setSeatNo(sc.nextInt());
					passengerList.add(p);
					break;
				}
				case 2:{
					System.out.println("enter source");
					
					break;
				}
			default:
				System.out.println("enter proper input");
			}			
			sc.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
