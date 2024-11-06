package com.ps;

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

        // 1) Add ticket
        // 2) Add souvenir
        // 3) See trip details
        // 4) Checkout
        // 0) Back

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

        System.out.println("Do you want a parking pass? (y)es or (n)o");
        System.out.print("Selection: ");
        String parking = inputScanner.nextLine();

        System.out.println("Do you want a Souvenir Guidebook? (y)es or (n)o");
        System.out.print("Selection: ");
        String guidebook = inputScanner.nextLine();

        System.out.println("Do you want a Meal Voucher? (y)es or (n)o");
        System.out.print("Selection: ");
        String voucher = inputScanner.nextLine();

        System.out.println("------Experiences------");

        System.out.println("Do you want attend the following experience:");

        System.out.print("Animal Feeding: (y)es or (n)o:");
        String feeding = inputScanner.nextLine();

        System.out.print("Behind the Scenes Tour: (y)es or (n)o:");
        String tour = inputScanner.nextLine();

        System.out.print("Kid's Petting Zoo: (y)es or (n)o:");
        String petting = inputScanner.nextLine();

        System.out.print("Safari Tram Ride: (y)es or (n)o:");
        String tram = inputScanner.nextLine();

        // Add this to the trip
    }
}
