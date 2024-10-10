package com.ps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        getInventory();

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }

    }

    public static void getInventory() {

//        // Create 5 instances of Product and add them to the ArrayList named inventory
//        Product product1 = new Product(1, "Headphones", 9.99f);
//        Product product2 = new Product(2, "Earring", 2.99f);
//        Product product3 = new Product(3, "Shoes", 49.99f);
//        Product product4 = new Product(4, "Shirt", 19.99f);
//        Product product5 = new Product(5, "Pants", 29.99f);
//
//        inventory.add(product1);
//        inventory.add(product2);
//        inventory.add(product3);
//        inventory.add(product4);
//        inventory.add(product5);

        // Bonus: Create instances of Product that comes from a file

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("products.csv"));
            String header = bufferedReader.readLine();
            String input;
            while((input = bufferedReader.readLine()) != null){
                String[] productArr = input.split("\\|");

                int id = Integer.parseInt(productArr[0]);
                String name = productArr[1];
                float price = Float.parseFloat(productArr[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Bonus: Create a menu to interact with our ArrayList named inventory


        // this method loads product objects into inventory // and its details are not shown

    }
}