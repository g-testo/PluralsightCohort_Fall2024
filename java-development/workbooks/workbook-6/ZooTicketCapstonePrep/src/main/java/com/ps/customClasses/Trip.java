package com.ps.customClasses;

import java.util.List;

public class Trip {
    private List<Ticket> tickets;
    private List<Souvenir> souvenirs;

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public void addSouvenir(Souvenir souvenir){
        souvenirs.add(souvenir);
    }
    public void printTripDetails(){
        System.out.println("Trip details");
    }

    public void saveToFile(){

    }

    public double getPrice(){
        return 0;
    }
}
