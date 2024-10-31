package com.ps;

import java.util.Scanner;

public class UserInterface {
    private static Zoo zoo;
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);
    private static void init(){
        // Read a zoom from a file
        zoo = FileManager.readZoo();
    }

    public static void display(){
        init();
        showMainMenu();
    }

    public static void showMainMenu(){
        int mainMenuCommand;

        do{
            System.out.println("What would you like to do?");
            System.out.println("1) Add Animal");
            System.out.println("2) Remove Animal");
            System.out.println("3) Show All Animals");
            System.out.println("4) Filter All Animals By Age Range");
            System.out.print("Command: ");
            mainMenuCommand = commandScanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    addAnimal();
                    break;
                case 2:
                    removeAnimalByIndex();
                    break;
                case 3:
                    showAllAnimals();
                    break;
                case 4:
                    showAllAnimalsFilteredByAge();
                    break;
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid command, try again");
            }

        } while(mainMenuCommand != 0);
    }
    public static void addAnimal(){
        // Ask the user for the animal details

        // What type of animal, Lion or Axolotl?
        // Create instance of class related to that type

    }
    public static void removeAnimalByIndex(){
        // Show all animals and show the position
        // Ask the user for an index of an animal to remove

    }
    public static void showAllAnimals(){
        // Show all animals
    }
    public static void showAllAnimalsFilteredByAge(){
        // Ask user for age range
        // Show animals within given age range
    }
}
