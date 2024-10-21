package com.ps;

public class Room {
    private int numberOfBeds;
    private float price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, float price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable(){
        return !isOccupied && !isDirty;
    }

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
    }
    public void checkout(){
        this.isOccupied = false;
    }
    public void cleanRoom(){
        this.isDirty = false;
    }

}
