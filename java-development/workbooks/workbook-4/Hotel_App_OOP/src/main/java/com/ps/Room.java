package com.ps;

public class Room {
    private int numberOfbeds;
    private float price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfbeds, float price, boolean isOccupied, boolean isDirty) {
        this.numberOfbeds = numberOfbeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfbeds() {
        return numberOfbeds;
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
}
