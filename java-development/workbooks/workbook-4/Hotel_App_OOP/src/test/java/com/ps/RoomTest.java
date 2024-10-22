package com.ps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInMethod_should_setIsOccupiedAndIsDirty_toTrue() {
        // Arrange
        Room room = new Room(2, 199.99f);

        // Act
        room.checkIn();

        // Assert
        boolean actualIsOccupied = room.isOccupied();
        boolean actualIsDirty = room.isDirty();

        assertTrue(actualIsOccupied);
        assertTrue(actualIsDirty);
    }

    @Test
    void checkOutMethod_should_setIsOccupied_toFalse_and_isDirty_staysTrue() {
        // Arrange
        Room room = new Room(2, 199.99f);
        room.checkIn();

        // Act
        room.checkout();

        // Assert
        boolean actualIsOccupied = room.isOccupied();
        boolean actualIsDirty = room.isDirty();

        assertFalse(actualIsOccupied);
        assertTrue(actualIsDirty);
    }

    @Test
    void cleanRoomMethod_should_setIsDirty_toFalse() {
        // Arrange
        Room room = new Room(2, 199.99f);
        room.checkIn();
        room.checkout();

        // Act
        room.cleanRoom();

        // Assert
        boolean actualIsDirty = room.isDirty();

        assertFalse(actualIsDirty);
    }
}