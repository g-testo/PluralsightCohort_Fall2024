package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // ***** BEGIN Create menu Instructions *****

        // Initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        // Create a do-while loop with a conditional for the command=
        do{
            // Display the menu, sout
            System.out.println("Please enter an option: ");
            System.out.println("1) Add animal");
            System.out.println("2) Display animals(Nested)");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            // Import Scanner, create instance of scanner as a class variable
            // Use scanner to store the users command input into a variable ()
            mainMenuCommand = commandScanner.nextInt();

            // switch statement to match the user command to the provided cases
            switch (mainMenuCommand){
                case 1:
                    // create static methods that match the corresponding command
                    addAnimal();
                    break;
                case 2:
                    // Create code for each static method
                    displaySubMenu();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    // Handle incorrect commands
                    System.out.println("Command not found, please try again");
            }

        } while(mainMenuCommand != 0);

        // ***** END Create menu Instructions *****

    }

    public static void addAnimal(){
        System.out.println("Command for adding an animal");
        // Add code for adding animal
    }

    public static void displaySubMenu(){
        // Initialize variable to store command
        int subMenuCommand;

        // Create do while loop
        do{
            // display the sub menu options
            System.out.println("Please enter an option: ");
            System.out.println("1) Display All");
            System.out.println("2) Display publicly available");
            System.out.println("3) Search by name");
            System.out.println("4) Search by type");
            System.out.println("5) Search by age range");
            System.out.println("6) Search by origin");

            System.out.println("0) Back");
            System.out.print("Command: ");

            // Get input from user
            subMenuCommand = commandScanner.nextInt();

            // switch statement to trigger according static methods
            switch(subMenuCommand){
                case 1:
                    displayAll();
                    break;
                case 2:
                    displayPubliclyAvailable();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    searchByType();
                    break;
                case 5:
                    searchByAgeRange();
                    break;
                case 6:
                    searchByOrigin();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Command not found. Try again");
            }

        } while(subMenuCommand != 0);

    }

    public static void displayAll(){
        System.out.println("Placeholder: Display All");
    }
    public static void displayPubliclyAvailable(){
        System.out.println("Placeholder: Display publicly available");
    }

    public static void searchByName(){
        System.out.println("Placeholder: Search by name");
    }

    public static void searchByType(){
        System.out.println("Placeholder: Search by type");
    }
    public static void searchByAgeRange(){
        System.out.println("Placeholder: Search by age range");
    }

    public static void searchByOrigin(){
        System.out.println("Placeholder: Search by origin");
    }

}