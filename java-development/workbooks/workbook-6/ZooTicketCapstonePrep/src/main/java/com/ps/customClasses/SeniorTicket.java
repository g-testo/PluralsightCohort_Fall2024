package com.ps.customClasses;

public class SeniorTicket extends Ticket{
    private double basePrice;
    public SeniorTicket(String ownerName, String membership) {
        super(ownerName, membership);
        if(membership.equals("none")){
            this.basePrice = 15;
        } else if(membership.equals("gold")){
            this.basePrice = 12;
        } else {
            this.basePrice = 10;
        }
    }

    public double getPrice(){
        return this.basePrice;
    }
}
