package com.ps.customClasses;

import java.util.ArrayList;
import java.util.List;

public class ChildTicket extends Ticket{
    private double basePrice;
    public ChildTicket(String ownerName, String membership) {
        super(ownerName, membership);
        if(membership.equals("none")){
            this.basePrice = 10;
        } else if(membership.equals("gold")){
            this.basePrice = 8;
        } else {
            this.basePrice = 7;
        }
    }

    public double getPrice(){
        List<Product> products = new ArrayList<>();
        products.addAll(this.getAddOns());
        products.addAll(this.getExperiences());

        double totalProductPrice = 0;
        for(Product product: products){
            totalProductPrice += product.getPrice(this.getMembership());
        }

        return this.basePrice + totalProductPrice;
    }
}
