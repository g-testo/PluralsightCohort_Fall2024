package com.ps;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    //    getPrice()
    public float getprice(){
//        The room type can be either "king" or "double".
//        If the room type is "king" the price per night is
//        $139.00 if the room type is "double" the price per
//        night is $124.00
        float price;
        if(this.roomType.equalsIgnoreCase("king")){
            price = 139.00f;
        } else {
            price = 124.00f;
        }

        if(this.isWeekend){
            price *= 1.1;
        }

        return price;
    }
    //    getReservationTotal()
    public float getReservationTotal(){
        return this.getprice() * this.numberOfNights;
    }
}
