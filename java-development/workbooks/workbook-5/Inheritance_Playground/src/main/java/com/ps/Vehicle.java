package com.ps;

public class Vehicle {
    private int VIN;
    private String make;
    private String model;
    private String color;

    public Vehicle(){}
    public Vehicle(int VIN, String make, String model, String color) {
        this.VIN = VIN;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
