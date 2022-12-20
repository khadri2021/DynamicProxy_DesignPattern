package com.khadri.reflection.dynamic.proxy.design.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Objects;

public class BookingCounterInvocationImpl implements InvocationHandler {

	private Reservation targetObject;

	public BookingCounterInvocationImpl(Reservation targetObject) {
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("ticketBooking")) {
			LocalDate localDate = (LocalDate) args[0];

			if (Objects.nonNull(localDate) && localDate.getDayOfWeek().name().equals(DayOfWeek.SUNDAY.name())) {
				throw new RuntimeException(
						"Hurry Its " + localDate.getDayOfWeek().name() + " No Bookings Available !!");
			} else {
				method.invoke(targetObject, args);
			}
		}else if(method.getName().equals("checkAvailSeats")) {
			Integer noOfSeats = (Integer) method.invoke(targetObject, args);
			System.out.println("Available Seats: "+noOfSeats);
			
		}

		return null;
	}

}
