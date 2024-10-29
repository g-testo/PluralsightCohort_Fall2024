package com.ps;

public class Candy {
    private String flavorType;
    private float price;
    // quantityPerPackage
    // SugarLevel
    // caloricValue
    // packageTheme
    // flavorTheme
    // weight
    // dimension
    // costToMake
    // onSale
    // chocolateLevel

    public Candy(){}

    public Candy(String flavorType, float price){
        this.flavorType = flavorType;
        this.price = price;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
