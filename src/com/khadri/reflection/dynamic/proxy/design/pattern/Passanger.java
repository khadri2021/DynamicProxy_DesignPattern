package com.khadri.reflection.dynamic.proxy.design.pattern;

import java.lang.reflect.Proxy;
import java.time.LocalDate;

public class Passanger {

	public static void main(String[] args) {
		BusReservation busReservation = new BusReservation(new BookInfo(900.00, "AP5576"));
 
		BookingCounterInvocationImpl invocationImpl = new BookingCounterInvocationImpl(busReservation);

		Reservation newProxyInstance = (Reservation) Proxy.newProxyInstance(Reservation.class.getClassLoader(),
				new Class[] { Reservation.class }, invocationImpl);

		LocalDate plusDays = LocalDate.now().plusDays(6);
		newProxyInstance.ticketBooking(plusDays);
		newProxyInstance.checkAvailSeats();
	} 
}
