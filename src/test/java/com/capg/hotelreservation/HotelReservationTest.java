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
		assertTrue(hotelReservation.findCheapestHotel("11 Sep 2020", "12 Sep 2020"));
	}

	/**
	 * UC3 testing
	 */
	@Test
	void whenNewHotelAddedWithWeekend_shouldReturnTrue() {

		HotelReservation hotelReservationObject = new HotelReservation();
		assertTrue(hotelReservationObject.addHotel("Lakewood", 110, 90));
		assertTrue(hotelReservationObject.addHotel("Bridgewood", 160, 60));
		assertTrue(hotelReservationObject.addHotel("Ridgewood", 220, 150));
		hotelReservationObject.printHotels();
	}

	/**
	 * UC4 Testing
	 */
	@Test
	void whenFindCheapestHotelIsCalled_shouldReturn_nameOfHotelWithCheapestRent() {
		HotelReservation hotelReservation = new HotelReservation();
		assertTrue(hotelReservation.addHotel("Lakewood", 110, 90));
		assertTrue(hotelReservation.addHotel("Bridgewood", 160, 60));
		assertTrue(hotelReservation.addHotel("Ridgewood", 220, 150));
		assertTrue(hotelReservation.findCheapestHotel("11 Sep 2020", "12 Sep 2020"));
	}

	/**
	 * UC5 testing
	 */
	@Test
	void whenNewHotelAddedWithRating_shouldReturnTrue() {

		HotelReservation hotelReservationObject = new HotelReservation();
		assertTrue(hotelReservationObject.addHotel("Lakewood", 110, 90, 3));
		assertTrue(hotelReservationObject.addHotel("Bridgewood", 160, 60, 4));
		assertTrue(hotelReservationObject.addHotel("Ridgewood", 220, 150, 5));
		hotelReservationObject.printHotels();
	}

	/**
	 * UC6 testing
	 */
	@Test
	void whenCheapestBestRatedCalled_shouldReturn_bestRatedHotel() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 110, 90, 3);
		hotelReservation.addHotel("Bridgewood", 150, 50, 4);
		hotelReservation.addHotel("Ridgewood", 220, 150, 5);
		assertTrue(hotelReservation.cheapestBestRatedHotel("11 Sep 2020", "12 Sep 2020"));
	}
}
