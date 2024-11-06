package com.ps.customClasses;

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
        return this.basePrice;
    }
}
