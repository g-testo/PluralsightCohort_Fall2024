package com.ps;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Dealership dealership;
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);
    private static void init(){
        dealership = DealershipFileManager.getDealership();
    }

    public static void display(){
        init();
        showMainMenu();
    }

    public static void showMainMenu(){
        int mainMenuCommand;

        do{
            System.out.println("What would you like to do?");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("10 - Sell/Lease a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Command: ");
            mainMenuCommand = commandScanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    findVehicleByPriceRange();
                    break;
                case 2:
                    findVehicleByMakeModel();
                    break;
                case 3:
                    findVehicleByYearRange();
                    break;
                case 4:
                    findVehicleByColor();
                    break;
                case 5:
                    findVehicleByMileageRange();
                    break;
                case 6:
                    findVehiclesByType();
                    break;
                case 7:
                    listAllVehicles();
                    break;
                case 8:
                    addVehicle();
                    break;
                case 9:
                    removeVehicle();
                    break;
                case 10:
                    sellLeaseVehicle();
                case 99:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid command, try again");
            }

        } while(mainMenuCommand != 99);
    }

    private static void findVehicleByPriceRange() {
    }

    private static void findVehicleByMakeModel() {
    }

    private static void findVehicleByYearRange() {
    }

    private static void findVehicleByColor() {
    }

    private static void findVehicleByMileageRange() {
    }

    private static void findVehiclesByType() {
    }

    private static void listAllVehicles() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        for(Vehicle vehicle: vehicles){
            displayVehicle(vehicle);
        }
    }

    private static void addVehicle() {
//        Ask the user for details about the vehicle
//        dealership.addVehicle(vehicle);
//        DealershipFileManager.saveDealership(dealership);
    }

    private static void removeVehicle() {
//        Ask the user for which vehicle to remove
//        dealership.removeVehicle(vehicle);
//        DealershipFileManager.saveDealership(dealership);
    }

    private static void displayVehicle(Vehicle vehicle){
        System.out.printf("Make: %s, Model: %s, Year: %d, Odometer: %d",
            vehicle.getMake(),
            vehicle.getModel(),
            vehicle.getYear(),
            vehicle.getOdometer()
        );
    }

    private static void sellLeaseVehicle() {
        // Get contract information from user
    }
}
