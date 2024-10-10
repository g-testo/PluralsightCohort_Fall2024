package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Animal> allAnimalsInZoo = new ArrayList<>();

    public static void main(String[] args) {
        loadAnimalsFromFile();

        // ***** BEGIN Create menu Instructions *****

        // Initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        // Create a do-while loop with a conditional for the command=
        do {
            // Display the menu, sout
            System.out.println("Please enter an option: ");
            System.out.println("1) Add animal");
            System.out.println("2) Display animals");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            // Import Scanner, create instance of scanner as a class variable
            // Use scanner to store the users command input into a variable ()
            try {
                mainMenuCommand = commandScanner.nextInt();
            } catch (InputMismatchException ime) {
//                ime.printStackTrace();
                mainMenuCommand = 0;
            }

            // switch statement to match the user command to the provided cases
            switch (mainMenuCommand) {
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

        } while (mainMenuCommand != 0);

        // ***** END Create menu Instructions *****

    }

    public static void loadAnimalsFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("animals.csv"));

            String firstLine = bufferedReader.readLine();
            String input;

            while ((input = bufferedReader.readLine()) != null) {
                String[] animalArr = input.split("\\|"); // "Leo|Lion|8|Americas|true" >> ["Leo", "Lion",...]
//                0-name|1-type|2-age|3-origin|4-isPubliclyAvailable
                String name = animalArr[0];
                String type = animalArr[1];
                int age = Integer.parseInt(animalArr[2]); // "8" >> 8
                String origin = animalArr[3];
                boolean isPubliclyAvailable = Boolean.parseBoolean(animalArr[4]);

                allAnimalsInZoo.add(new Animal(name, type, age, origin, isPubliclyAvailable));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addAnimal() {
        System.out.println("Command for adding an animal");
        // Add code for adding animal
        System.out.println("Please enter the details of the animal...");

        System.out.print("Name: ");
        String name = inputScanner.nextLine();

        System.out.print("Type: ");
        String type = inputScanner.nextLine();

        System.out.print("Age: ");
        int age = inputScanner.nextInt();

        inputScanner.nextLine();

        System.out.print("Origin: ");
        String origin = inputScanner.nextLine();

        System.out.print("Is publicly available: ");
        boolean isPubliclyAvailable = inputScanner.nextBoolean();

        Animal animal = new Animal(name, type, age, origin, isPubliclyAvailable);
        allAnimalsInZoo.add(animal);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("animals.csv", true));
            bufferedWriter.write(String.format("\n%s|%s|%d|%s|%b",
                    animal.getName(),
                    animal.getType(),
                    animal.getAge(),
                    animal.getOrigin(),
                    animal.isPubliclyAvailable()
            ));

            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displaySubMenu() {
        // Initialize variable to store command
        int subMenuCommand;

        // Create do while loop
        do {
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
            switch (subMenuCommand) {
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

        } while (subMenuCommand != 0);

    }

    public static void displayAll() {
        System.out.println("Placeholder: Display All");
        for (int i = 0; i < allAnimalsInZoo.size(); i++) {
            System.out.println(allAnimalsInZoo.get(i));
        }
    }

    public static void displayPubliclyAvailable() {
        System.out.println("Placeholder: Display publicly available");
        for (int i = 0; i < allAnimalsInZoo.size(); i++) {
            Animal currentAnimal = allAnimalsInZoo.get(i);
            if (currentAnimal.isPubliclyAvailable()) {
                System.out.println(currentAnimal);
            }
        }
    }

    public static void searchByName() {
        System.out.println("Placeholder: Search by name");

        System.out.println("Please provide the animal name you're looking for...");
        System.out.print("Name: ");
        String nameToSearch = inputScanner.nextLine();

        for (int i = 0; i < allAnimalsInZoo.size(); i++) {
            Animal currentAnimal = allAnimalsInZoo.get(i);
            if (currentAnimal.getName().equalsIgnoreCase(nameToSearch)) {
                System.out.println(currentAnimal);
            }
        }
    }

    public static void searchByType() {
        System.out.println("Placeholder: Search by type");

        System.out.println("Please provide the animal type you're looking for...");
        System.out.print("Type: ");
        String typeToSearch = inputScanner.nextLine();

        for (int i = 0; i < allAnimalsInZoo.size(); i++) {
            Animal currentAnimal = allAnimalsInZoo.get(i);
            if (currentAnimal.getType().equalsIgnoreCase(typeToSearch)) {
                System.out.println(currentAnimal);
            }
        }
    }

    public static void searchByAgeRange() {
        System.out.println("Placeholder: Search by age range");

        System.out.println("Please provide the younger age of the animal range...");
        System.out.print("Min Age: ");
        int minAge = inputScanner.nextInt();

        System.out.println("Please provide the oldest age of the animal range...");
        System.out.print("Max Age: ");
        int maxAge = inputScanner.nextInt();

        for (int i = 0; i < allAnimalsInZoo.size(); i++) {
            Animal currentAnimal = allAnimalsInZoo.get(i);
            int currentAnimalAge = currentAnimal.getAge();

            if (currentAnimalAge >= minAge && currentAnimalAge <= maxAge) {
                System.out.println(currentAnimal);
            }
        }
    }

    public static void searchByOrigin() {
        System.out.println("Placeholder: Search by origin");
    }

}