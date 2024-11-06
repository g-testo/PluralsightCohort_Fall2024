package com.ps.customClasses;

public class Product {
    private String name;
    private double notMemberPrice;
    private double goldMemberPrice;
    private double platinumPrice;

    public Product(String name, double notMemberPrice, double goldMemberPrice, double platinumPrice) {
        this.name = name;
        this.notMemberPrice = notMemberPrice;
        this.goldMemberPrice = goldMemberPrice;
        this.platinumPrice = platinumPrice;
    }

    public double getPrice(String membership){
        if(membership.equals("none")){
            return this.notMemberPrice;
        } else if(membership.equals("gold")){
            return this.goldMemberPrice;
        } else {
            return this.platinumPrice;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
