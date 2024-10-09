package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Candy> inventory = new ArrayList<>();
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
            // Read the header line
            String header = bufferedReader.readLine();
            String input;

            int currentIndex = 0;
            // Loop every line of candy
            while((input = bufferedReader.readLine()) != null){
                // "Warheads|1.89|Sour|371"
                String[] candyArr = input.split("\\|"); // [ "Warheads", "1.89", "Sour", "371" ]
//                System.out.println(Arrays.toString(candy));
                String name = candyArr[0];
                float price = Float.parseFloat(candyArr[1]);
                String flavor = candyArr[2];
                short quantity = Short.parseShort(candyArr[3]);

                Candy candy = new Candy(name, price, flavor, quantity);

                // add each piece of candy to the inventory variable
                inventory.add(candy);
                currentIndex++;
            }

        } catch (Exception e){
            e.printStackTrace();
        }


            // Add candy
                // Add the new candy to the file(Append)

            // Show all candy (Alphabetically)
            // Show all candy (Flavor)
            // Show all candy (Price)
        for(Candy candy: inventory){
            if(candy == null) continue;

            if(candy.getFlavor().equals("Fruity")){
                System.out.println(candy);
            }
        }


            // Search(To do)

        // Do it
        // Refactor

    }
}