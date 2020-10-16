package com.capg.hotelreservation;

@SuppressWarnings("serial")
public class InvalidEntryException extends Exception {
	public InvalidEntryException(String message) {
		super(message);
	}
}
