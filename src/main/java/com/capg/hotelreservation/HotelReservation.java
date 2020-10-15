package com.capg.hotelreservation;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HotelReservation {
	private static Map<String, Hotel> hotelMap;

	public HotelReservation() {
		hotelMap = new HashMap<>();
	}

	/**
	 * UC1 adding hotel to the system
	 * 
	 * @param name
	 * @param regularWeekday
	 * @return
	 */
	public boolean addHotel(String name, int regWeekdayRate) {
		Hotel hotelObject = new Hotel(name, regWeekdayRate);
		hotelMap.put(name, hotelObject);
		return true;
	}

	/**
	 * Prints the hotels
	 */
	public void printHotels() {
		for (Map.Entry<String, Hotel> entry : hotelMap.entrySet()) {
			System.out.println("Hotel Name : " + entry.getKey());
			System.out.println("Rate on weekdays for regular customers : " + entry.getValue().getRegWeekdayRate());
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Reservation Program");
	}
}
