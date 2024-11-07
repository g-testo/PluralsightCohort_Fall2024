package com.ps.customClasses;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    private String membership;
    private List<Ticket> tickets;
    private List<String> souvenirs;

    public Trip() {
        this.tickets = new ArrayList<>();
        this.souvenirs = new ArrayList<>();
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public void addSouvenir(String souvenir){
        souvenirs.add(souvenir);
    }

    public List<Ticket> getTickets(){
        return this.tickets;
    }

    public List<String> getSouvenirs(){
        return this.souvenirs;
    }

    public void saveToFile(){

    }

    public double getPrice(){
        // Total price of all of our tickets
        double ticketsTotal = 0;
        for(Ticket ticket: this.tickets){
            ticketsTotal += ticket.getPrice();
        }
        // Total price of all of our souvenirs
        double souvenirTotal;
        if(this.membership.equals("platinum")){
            souvenirTotal = this.souvenirs.size() * 6;
        } else if(this.membership.equals("gold")){
            souvenirTotal = this.souvenirs.size() * 8;
        } else {
            souvenirTotal = this.souvenirs.size() * 10;
        }

        return ticketsTotal + souvenirTotal;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
