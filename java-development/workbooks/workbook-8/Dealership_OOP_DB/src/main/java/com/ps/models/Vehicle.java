package com.ps.models;

public class Vehicle {
    private String vin;
    private String make;
    private String model;
    private String color;
    private boolean sold;
    private int dealership_id;

    public Vehicle() {}

    public Vehicle(String vin, String make, String model, String color, boolean sold, int dealership_id) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.sold = sold;
        this.dealership_id = dealership_id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getDealership_id() {
        return dealership_id;
    }

    public void setDealership_id(int dealership_id) {
        this.dealership_id = dealership_id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", sold=" + sold +
                ", dealership_id=" + dealership_id +
                '}';
    }
}
