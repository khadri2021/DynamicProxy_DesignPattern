package com.khadri.reflection.dynamic.proxy.design.pattern;

import java.time.LocalDate;

public interface Reservation {

	void ticketBooking(LocalDate localDate);

	Integer checkAvailSeats();
}
