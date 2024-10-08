package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static Candy[] inventory = new Candy[100];
    public static void main(String[] args) {
        // Do we understand the problem?
            // Creating an app to keep track of candy in a store
            // Class for Candy
                // Properties
                    // String name, float price, String flavor, short quantity
                // Methods
                    // toString, getters and setters
            // Keep track of candy
            // Read candy from a file
            // Create candy and write it to a file

        // Create a plan

            // Create the class for Candy
            // Create a static variable for tracking inventory of candy
            // Create a file with initial inventory

            // Read candy from file
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("candies.csv"));
        } catch (Exception e){
            e.printStackTrace();
        }
            // Loop every line of candy
                // add each piece of candy to the inventory variable

            // Add candy
                // Add the new candy to the file(Append)

            // Show all candy (Alphabetically)
            // Show all candy (Flavor)
            // Show all candy (Price)

            // Search(To do)

        // Do it
        // Refactor

    }
}