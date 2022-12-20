package com.khadri.reflection.dynamic.proxy.design.pattern;

import java.time.LocalDate;

public class BusReservation implements Reservation {

	private BookInfo bookInfo;

	public BusReservation(BookInfo bookInfo) {
		super();
		this.bookInfo = bookInfo;
	}

	@Override
	public void ticketBooking(LocalDate localDate) {
		System.out.println(localDate + " : Ticket Booked Successfully !!!");
		System.out.println(bookInfo);
	}

	@Override
	public Integer checkAvailSeats() {
		return 10;
	}

	public BookInfo getBookInfo() {
		return bookInfo;
	}

}
