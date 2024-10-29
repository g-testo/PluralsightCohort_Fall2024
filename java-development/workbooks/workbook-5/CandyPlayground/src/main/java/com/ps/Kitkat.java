package com.ps;

public class Kitkat extends Candy{
    private String waferType;
    private String chocolateType;

    public Kitkat(String flavorType, float price, String waferType, String chocolateType) {
        super(flavorType, price);
        this.waferType = waferType;
        this.chocolateType = chocolateType;
    }

    public String getWaferType() {
        return waferType;
    }

    public void setWaferType(String waferType) {
        this.waferType = waferType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return "Kitkat{" +
                "waferType='" + waferType + '\'' +
                ", chocolateType='" + chocolateType + '\'' +
                '}';
    }
}
