package com.khadri.reflection.protection.proxy;

import java.time.LocalDate;

public class Passanger {

	public static void main(String[] args) {

		BusReservation busReservation = new BookingCounter(new BookInfo(9.9, "AP5576"));
		LocalDate localDate = LocalDate.now().plusDays(5);
		busReservation.ticketBooking(localDate);
		busReservation.checkAvailSeats();

	}
}
