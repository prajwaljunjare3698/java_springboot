package com.jspider.singleton.lazy.main;

import com.jspider.singleton.lazyclass.Booking;

public class MovieLazy {
	public static void main(String[] args) {
		Booking.bookTicket(30);
		Booking.bookTicket(70);
		Booking.bookTicket(30);
	}
}