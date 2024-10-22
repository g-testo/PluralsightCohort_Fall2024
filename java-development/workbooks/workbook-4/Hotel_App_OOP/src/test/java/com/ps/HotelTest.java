package com.ps;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
//    brake_should_stopCar_whenChangeIsGreater
    @org.junit.jupiter.api.Test
    void getAvailableSuites_should_returnAvailableSuites() {
        // Arrange
        Hotel hotel = new Hotel("Test Hotel", 100, 100, 25, 50);
        int expected = 75;

        // Act
        int actual = hotel.getAvailableSuites();

        // Assert
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getAvailableRooms_should_returnAvailableRooms() {
        // Arrange
        Hotel hotel = new Hotel("Test Hotel", 100, 100, 25, 50);
        int expected = 50;

        // Act
        int actual = hotel.getAvailableRooms();

        // Assert
        assertEquals(expected, actual);
    }
}