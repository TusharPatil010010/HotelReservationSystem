package com.capg.hotelreservation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HotelReservationTest {

	@Test
	void whenNewHotelAdded_shouldReturnTrue() {

		HotelReservation hotelReservationObject = new HotelReservation();
		assertTrue(hotelReservationObject.addHotel("Lakewood", 110, 90));
		assertTrue(hotelReservationObject.addHotel("Bridgewood", 160, 60));
		assertTrue(hotelReservationObject.addHotel("Ridgewood", 110, 150));

		hotelReservationObject.printHotelList();

	}
}
