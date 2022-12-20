package com.khadri.reflection.protection.proxy;

import java.time.LocalDate;

public class BookingCounter extends BusReservation {

	public BookingCounter(BookInfo bookInfo) {
		super(bookInfo);
	}

	@Override
	public void ticketBooking(LocalDate localDate) {
		if (super.getBookInfo().getPrice() > 0.0) {
			super.ticketBooking(localDate);
		} else {
			throw new RuntimeException("Price is invalid");
		}

	}
	
	@Override
	public Integer checkAvailSeats() {
		Integer checkAvailSeats = super.checkAvailSeats();
		System.out.println(checkAvailSeats+" : Available Seats");
		return checkAvailSeats;
	}
}
