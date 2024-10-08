package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Create a class Animal
        // Properties:
            // String name
            // String type
            // int age
            // String origin
            // boolean isPubliclyAvailable

        // Keep track of all of the animals at a zoo
        // Load initial animals from a file *

        // ******** Home ********
        // Add animal
        // Display Animals
            // All
            // Publicly Available Animals
            // Search Animal By Name
            // Search by type
            // Search by age range
            // Search origin
        // Exit

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
            mainMenuCommand = scanner.nextInt();

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


        // Have the ability to:
        // - Add an animal from the CLI
        //      - Write the animal to a file *

        // - Display all animals
        // - Display all publicly available animals
        // - Search for an animal by name
        // - Search by location *

    }

    public static void addAnimal(){
        System.out.println("Command for adding an animal");
        // Add code for adding animal
    }

    public static void displaySubMenu(){

    }
}