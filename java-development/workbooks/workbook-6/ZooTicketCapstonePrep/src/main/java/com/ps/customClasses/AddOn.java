package com.ps.customClasses;

//AddOn parking = new AddOn("Parking Pass", 5, 3, 0);
//
//parking.getPrice("none");
public class AddOn extends Product {
    public AddOn(String name, double notMemberPrice, double goldMemberPrice, double platinumPrice) {
        super(name, notMemberPrice, goldMemberPrice, platinumPrice);
    }
}
