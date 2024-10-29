package com.ps;

public class Boat extends Vehicle{
    private float sizeInFeet;
    private int numOfSails;

    public Boat(int VIN, String make, String model, String color, float sizeInFeet, int numOfSails) {
        super(VIN, make, model, color);
        this.sizeInFeet = sizeInFeet;
        this.numOfSails = numOfSails;
    }

    public float getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(float sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public int getNumOfSails() {
        return numOfSails;
    }

    public void setNumOfSails(int numOfSails) {
        this.numOfSails = numOfSails;
    }
}
