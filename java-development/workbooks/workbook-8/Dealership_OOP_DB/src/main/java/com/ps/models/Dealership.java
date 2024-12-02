package com.ps.models;

public class Dealership {
    private int dealership_id;
    private String name;
    private String address;
    private String phone;

    public Dealership() {}

    public Dealership(int dealership_id, String name, String address, String phone) {
        this.dealership_id = dealership_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getDealership_id() {
        return dealership_id;
    }

    public void setDealership_id(int dealership_id) {
        this.dealership_id = dealership_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "dealership_id=" + dealership_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
