package com.capg.hotelreservation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HotelReservationTest {

	/**
	 * UC1 testing
	 */
	@Test
	void whenNewHotelAdded_shouldReturnTrue() {

		HotelReservation hotelReservationObject = new HotelReservation();
		assertTrue(hotelReservationObject.addHotel("Lakewood", 110));
		assertTrue(hotelReservationObject.addHotel("Bridgewood", 160));
		assertTrue(hotelReservationObject.addHotel("Ridgewood", 110));

		hotelReservationObject.printHotels();
	}
	
	/**
	 * UC2 Testing
	 */
	@Test
	void whenFindCheapestHotelMethodCalled_shouldReturn_nameOfHotel() {
		HotelReservation hotelReservation = new HotelReservation();
		assertTrue(hotelReservation.addHotel("Lakewood", 110));
		assertTrue(hotelReservation.addHotel("Bridgewood", 160));
		assertTrue(hotelReservation.addHotel("Ridgewood", 220));
		assertEquals("Lakewood", hotelReservation.findCheapestHotel("10 Sep 2020", "11 Sep 2020"));
	}
}
