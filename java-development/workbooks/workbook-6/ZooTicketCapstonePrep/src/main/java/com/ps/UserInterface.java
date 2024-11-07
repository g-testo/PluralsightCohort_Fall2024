package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);

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

        System.out.println("What membership do you have?");
        System.out.println("1) Platinum");
        System.out.println("2) Gold");
        System.out.println("3) None");

        System.out.print("Selection: ");
        int membershipInput = commandScanner.nextInt();

        System.out.println("What ticket type would you like?");
        // TODO: Add dynamic ticket pricing to menu
        System.out.println("1) Adult");
        System.out.println("2) Child");
        System.out.println("3) Senior");

        System.out.print("Selection: ");
        int ticketTypeInput = commandScanner.nextInt();

        System.out.println("------Add Ons------");

        System.out.println("Do you want a parking pass? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int parking = inputScanner.nextInt();

        System.out.println("Do you want a Souvenir Guidebook? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int guidebook = inputScanner.nextInt();

        System.out.println("Do you want a Meal Voucher? 1) Yes or 2) No");
        System.out.print("Selection: ");
        int voucher = inputScanner.nextInt();

        System.out.println("------Experiences------");

        System.out.println("Do you want attend the following experience:");

        System.out.print("Animal Feeding: 1) Yes or 2) No");
        int feeding = inputScanner.nextInt();

        System.out.print("Behind the Scenes Tour: 1) Yes or 2) No");
        int tour = inputScanner.nextInt();

        System.out.print("Kid's Petting Zoo: 1) Yes or 2) No");
        int petting = inputScanner.nextInt();

        System.out.print("Safari Tram Ride: 1) Yes or 2) No");
        int tram = inputScanner.nextInt();

        // Add this to the trip
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
                // add the souvenir to trip
            }
        } while(souvenirSelectionCommand != 0);
    }

    private static void handleDisplayTripDetails() {
        System.out.println("handleDisplayTripDetails");
    }

    private static void handleCheckout() {
        System.out.println("handleCheckout");
    }
}
