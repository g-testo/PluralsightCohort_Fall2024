package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Vehicle[] inventory = new Vehicle[20];

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

        int mainMenuCommand;

        do{
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");

            System.out.print("Enter your command: ");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Command not found! Try again");
                    break;
            }

        } while(mainMenuCommand != 6);



    }

    public static void listAllVehicles(){

    }
}