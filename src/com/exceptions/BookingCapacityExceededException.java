package com.exceptions;

public class BookingCapacityExceededException extends RuntimeException {

	public BookingCapacityExceededException(String message) {
		super(message);
	}

	public BookingCapacityExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try {
			Booking booking = book();
		} catch (Exception e) {
			throw new BookingCapacityExceededException("Booking capacity problem!", e);
		}

	}

	static Booking book() {
		if (!isCapacityAvailable()) {
			throw new BookingCapacityExceededException("The booking capacity is exceeded!");
		}
		return new Booking();
	}

	private static boolean isCapacityAvailable() {

		return true;
	}

}
