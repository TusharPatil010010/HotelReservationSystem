package com.capg.hotelreservation;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HotelReservation {

	List<Hotel> myHotelList;

	public HotelReservation() {
		myHotelList = new ArrayList<>();
	}

	/**
	 * UC1 adding hotels
	 * 
	 * @param name
	 * @param regWeekdayRate
	 * @param regWeekendRate
	 * @return
	 */
	public boolean addHotel(String name, int regWeekdayRate, int regWeekendRate) {
		Hotel hotel = new Hotel(name, regWeekdayRate, regWeekendRate);
		myHotelList.add(hotel);
		return true;
	}

	public void printHotelList() {
		for (Hotel hotel : myHotelList) {
			System.out.println("Hotel Name : " + hotel.getHotelName());
			System.out.println("Rate for regular customer for weekday : " + hotel.getRegWeekdayRate());
			System.out.println("Rate for regular customer for weekend : " + hotel.getRegWeekendRate());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Hotel Reservation Program");
	}
}