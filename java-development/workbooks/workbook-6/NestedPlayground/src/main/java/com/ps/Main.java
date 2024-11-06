package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // import scanner
        // instantiate scanner as a static variable

        // Instructions for creating a menu
        // create a variable to store a command
        // create a do while loop(As long as the command is not 0)
            // Display the command options
            // Request a command

            // Switch statement that controls what methods to trigger
                // Add case statements for each command
                // Add one for exiting
                // Add default in case command is not found
        // End of instructions

        int mainCommand;
        do{
            System.out.println("Please select an option: ");
            System.out.println("1) Option 1");
            System.out.println("2) Option 2(Nested)");
            System.out.println("0) Exit");

            System.out.print("Command: ");
            mainCommand = commandScanner.nextInt();

            switch(mainCommand){
                case 1:
                    handleOption1();
                    break;
                case 2:
                    handleOption2();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found, try again");
            }
        } while(mainCommand != 0);
    }
    public static void handleOption1(){
        System.out.println("You picked option 1");
    }
    public static void handleOption2(){
        int option2Command;
        do{
            System.out.println("Please select an option from option2: ");
            System.out.println("1) Option2 >> NestedOption1");
            System.out.println("2) Option2 >> NestedOption2");
            System.out.println("0) Back");

            System.out.print("Option2 >> Command: ");
            option2Command = commandScanner.nextInt();

            switch(option2Command){
                case 1:
                    handleNestedOption1();
                    break;
                case 2:
                    handleNestedOption2();
                    break;
                case 0:
                    System.out.println("Going back...");
                default:
                    System.out.println("Nested command not found, try again");
            }
        } while(option2Command != 0);
    }
    public static void handleNestedOption1(){
        System.out.println("You picked nested option 1");
    }
    public static void handleNestedOption2(){
        System.out.println("You picked nested option 2");
    }
}