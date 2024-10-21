package com.ps;

public class HotelOperations {
    public static void main(String[] args) {
//        Room room1 = new Room(3, 159, false, false);
//        System.out.println(room1.isAvailable());

        Reservation reservation = new Reservation("king", 5, true);
        System.out.println(reservation.getReservationTotal());
    }
}
