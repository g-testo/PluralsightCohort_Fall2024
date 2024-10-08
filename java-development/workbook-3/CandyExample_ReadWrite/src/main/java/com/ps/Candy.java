package com.ps;

public class Candy {

    // Write the properties as private
    private String name;
    private float price;
    private String flavor;
    private short quantity;

    // Generate full constructor

    public Candy(String name, float price, String flavor, short quantity) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    // Generate getters and setters for all properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }


    // Generate toString


    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
