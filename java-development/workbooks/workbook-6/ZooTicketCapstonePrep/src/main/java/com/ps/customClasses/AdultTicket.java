package com.ps.customClasses;

public class AdultTicket extends Ticket{
    private double basePrice;
    public AdultTicket(String ownerName, String membership) {
        super(ownerName, membership);
        if(membership.equals("none")){
            this.basePrice = 20;
        } else if(membership.equals("gold")){
            this.basePrice = 17;
        } else {
            this.basePrice = 14;
        }
    }

    public double getPrice(){
        return this.basePrice;
    }
}
