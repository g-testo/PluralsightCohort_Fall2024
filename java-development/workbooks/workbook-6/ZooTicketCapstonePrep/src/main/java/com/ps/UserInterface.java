package com.ps;

import com.ps.customClasses.*;

import java.util.HashMap;
import java.util.Scanner;

public class UserInterface {
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);

    private static Trip trip = new Trip();

    public static void display(){
        int mainCommand;

        do{
            System.out.println("Please choose an option:");
            System.out.println("1) New Trip");
            System.out.println("0) Exit");

            System.out.print("Command: ");
            mainCommand = commandScanner.nextInt();

            switch(mainCommand){
                case 1:
                    handleNewTrip();
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Command not found, please try again...");
            }

        }while(mainCommand != 0);
    }

    private static void handleNewTrip() {

        System.out.println("What membership do you have?");
        System.out.println("1) Platinum");
        System.out.println("2) Gold");
        System.out.println("3) None");

        HashMap<Integer, String> membershipOptions = new HashMap<>();
        membershipOptions.put(1, "platinum");
        membershipOptions.put(2, "gold");
        membershipOptions.put(3, "none");

        System.out.print("Selection: ");
        int membershipInput = commandScanner.nextInt();

        trip.setMembership(membershipOptions.get(membershipInput));

        int newTripCommand;

        do{
            System.out.println("What would you like to do?");
            System.out.println("1) Add Ticket");
            System.out.println("2) Add Souvenir");
            System.out.println("3) See Trip Details");
            System.out.println("4) Checkout");
            System.out.println("0) Start Over");

            System.out.print("Selection: ");
            newTripCommand = commandScanner.nextInt();

            switch (newTripCommand){
                case 1:
                    handleAddTicket();
                    break;
                case 2:
                    handleAddSouvenir();
                    break;
                case 3:
                    handleDisplayTripDetails();
                    break;
                case 4:
                    handleCheckout();
                    break;
                case 0:
                    System.out.println("Starting Over...");
                    break;
                default:
                    System.out.println("Command not found, please try again...");
            }
        } while(newTripCommand != 0);
    }

    private static void handleAddTicket(){
        System.out.print("What your name? ");
        String ownerName = inputScanner.nextLine();

        System.out.println("What ticket type would you like?");
        // TODO: Add dynamic ticket pricing to menu(Optional)
        System.out.println("1) Adult");
        System.out.println("2) Child");
        System.out.println("3) Senior");

        System.out.print("Selection: ");
        int ticketTypeInput = commandScanner.nextInt();

        Ticket ticket;
        if(ticketTypeInput == 2){
            ticket = new ChildTicket(ownerName, trip.getMembership());
        }else if(ticketTypeInput == 3){
            ticket = new SeniorTicket(ownerName, trip.getMembership());
        } else {
            ticket = new AdultTicket(ownerName, trip.getMembership());
        }

        System.out.println("------Add Ons------");

        System.out.println("Do you want a parking pass? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int parking = commandScanner.nextInt();
        if(parking == 1){
            ticket.addAddOn(new AddOn("Parking Pass", 5,3,0));
        }

        System.out.println("Do you want a Souvenir Guidebook? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int guidebook = commandScanner.nextInt();
        if(guidebook == 1){
            ticket.addAddOn(new AddOn("Souvenir Guidebook", 10,8,6));
        }

        System.out.println("Do you want a Meal Voucher? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int voucher = commandScanner.nextInt();
        if(voucher == 1){
            ticket.addAddOn(new AddOn("Meal Voucher", 15,12,10));
        }

        System.out.println("------Experiences------");

        System.out.println("Do you want attend the following experience:");

        System.out.println("Animal Feeding: 1) Yes or 2) No");
        System.out.print("Selection: ");

        int feeding = commandScanner.nextInt();
        if(feeding == 1){
            ticket.addExperience(new Experience("Animal Feeding", 10, 8, 6));
        }

        System.out.println("Behind the Scenes Tour: 1) Yes or 2) No");
        System.out.print("Selection: ");
        int tour = commandScanner.nextInt();
        if(tour == 1){
            ticket.addExperience(new Experience("Behind the Scenes Tour", 25, 20, 18));
        }

        System.out.println("Kid's Petting Zoo: 1) Yes or 2) No");
        System.out.print("Selection: ");
        int petting = commandScanner.nextInt();
        if(petting == 1){
            ticket.addExperience(new Experience("Kid's Petting Zoo", 5, 4, 0));
        }

        System.out.println("Safari Tram Ride: 1) Yes or 2) No");
        System.out.print("Selection: ");
        int tram = commandScanner.nextInt();
        if(tram == 1){
            ticket.addExperience(new Experience("Safari Tram Ride", 7, 5, 0));
        }

        trip.addTicket(ticket);
    }

    private static void handleAddSouvenir() {
        System.out.println("handleAddSouvenir");
        String[] souvenirNames = {
                "Plush Toy", "Keychain", "T-shirt", "Mug", "Magnet",
                "Hat", "Water Bottle", "Poster", "Notebook", "Pen"
        };

        int souvenirSelectionCommand;

        do{
            for(int i=0;i<souvenirNames.length;i++){
                System.out.println(i+1 + ") " + souvenirNames[i]);
            }
            System.out.println("0) Done");
            souvenirSelectionCommand = commandScanner.nextInt();
            if(souvenirSelectionCommand != 0){
                int index = souvenirSelectionCommand-1;
                trip.addSouvenir(souvenirNames[index]);
            }
        } while(souvenirSelectionCommand != 0);
    }

    private static void handleDisplayTripDetails() {
        System.out.println("Tickets: ");
        for(Ticket ticket: trip.getTickets()){
            System.out.println(ticket);
        }
        System.out.println("Souvenirs: ");
        for(String souvenir: trip.getSouvenirs()){
            System.out.print(souvenir);
        }

        // TODO: Print total cost of trip(Optional)
    }

    private static void handleCheckout() {
        System.out.println("handleCheckout");
        // TODO: Write to file all tickets, souvenirs and the (total)costs
        // NOTE: File Manager
    }
}
