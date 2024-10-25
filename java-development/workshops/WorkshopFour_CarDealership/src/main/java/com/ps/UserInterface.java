package com.ps;

public class UserInterface {
    // private static Dealership dealership;
    private static Dealership dealership;

    public static void init(){
        //Loading the dealership and inventory from a file
        dealership = DealershipFileManager.getDealership();
    }
    public static void display(){
        init();

        DealershipFileManager.saveDealership(dealership);
        System.out.println("Load the menu");
        // Load the menu
    }

}
