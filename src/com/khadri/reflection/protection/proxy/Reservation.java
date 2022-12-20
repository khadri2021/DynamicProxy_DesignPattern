package com.khadri.reflection.protection.proxy;

import java.time.LocalDate;

public interface Reservation {

	void ticketBooking(LocalDate localDate);

	Integer checkAvailSeats();
}
