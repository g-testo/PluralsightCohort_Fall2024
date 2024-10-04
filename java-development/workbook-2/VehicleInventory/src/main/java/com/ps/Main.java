package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Vehicle[] inventory = new Vehicle[20];
    static int nextEmptyIndex = 0;

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(101122, "Honda Civic", "Blue", 32000, 12000);
        Vehicle vehicle2 = new Vehicle(101123, "Toyota Camry", "Black", 28000, 15000);
        Vehicle vehicle3 = new Vehicle(101124, "Chevrolet Malibu", "White", 33000, 14000);
        Vehicle vehicle4 = new Vehicle(101125, "Nissan Altima", "Silver", 36000, 14500);
        Vehicle vehicle5 = new Vehicle(101126, "BMW X5", "Gray", 42000, 20000);
        Vehicle vehicle6 = new Vehicle(101127, "Mercedes-Benz C-Class", "Black", 49000, 23000);

        inventory[0] = vehicle1;
        inventory[1] = vehicle2;
        inventory[2] = vehicle3;
        inventory[3] = vehicle4;
        inventory[4] = vehicle5;
        inventory[5] = vehicle6;
        nextEmptyIndex = 6;

        int mainMenuCommand;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");

            System.out.print("Enter your command: ");

            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found! Try again");
                    break;
            }

        } while (mainMenuCommand != 6);

    }

    public static void listAllVehicles() {
        for (Vehicle vehicle : inventory) {
            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByMakeModel() {
        System.out.println("What (make model) are you looking for?");
        String makeModel = scanner.nextLine().trim();

        for (Vehicle vehicle : inventory) {
            boolean doesMatchMakeModel = vehicle.getMakeModel().equalsIgnoreCase(makeModel);
            if (vehicle != null && doesMatchMakeModel) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByPriceRange() {
        System.out.println("What price range are you looking for?");

        System.out.print("Min: ");
        float minPrice = scanner.nextFloat();

        System.out.print("Max: ");
        float maxPrice = scanner.nextFloat();

        for (Vehicle vehicle : inventory) {
            boolean isVehicleInRange = (vehicle.getPrice() > minPrice) && (vehicle.getPrice() < maxPrice);
            if (vehicle != null && isVehicleInRange) {
                System.out.println(vehicle);
            }
        }
    }

    public static void searchByColor() {
        System.out.println("What color are you looking for?");
        String color = scanner.nextLine().trim();

        for (Vehicle vehicle : inventory) {
            boolean doesMatchColor = vehicle.getColor().equalsIgnoreCase(color);
            if (vehicle != null && doesMatchColor) {
                System.out.println(vehicle);
            }
        }
    }

    public static void addAVehicle() {
        System.out.println("Please provide vehicle details");
        System.out.print("Vehicle ID: ");
        long vin = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Make Model: ");
        String makeModel = scanner.nextLine().trim();

        System.out.print("Color: ");
        String color = scanner.nextLine().trim();

        System.out.print("Odometer Reading: ");
        int odometer = scanner.nextInt();

        System.out.print("Price: ");
        float price = scanner.nextFloat();
        // [1, 2, 3, 4, 5, 6, 7] - 6
        // 0 1 2 3 4 5 6 _

        inventory[nextEmptyIndex] = new Vehicle(vin, makeModel, color, odometer, price);
        nextEmptyIndex++;
    }

}