package com.ps;

//Step 2
//    Verify that your class is built correctly by creating a new instance of a CellPhone in your
//        Main.main() method.
//    Create a new instance of a CellPhone, then prompt the user for the cell phone information:
//    What is the serial number? 2597153
//    What model is the phone? iPhone 15 Pro Max Who is the carrier? Verizon
//    What is the phone number? 888-555-1234
//    Who is the owner of the phone? Sandra
//    Use the setters of your CellPhone object to add the values entered by the user. Using the
//        getters of the CellPhone print the properties of the phone to the
//    screen.


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the serial number?");
        int serialNumber = scanner.nextInt();

        System.out.print("What model is the phone?");
        String model = scanner.nextLine();

        System.out.print("What phone number of the phone?");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        System.out.print("Who is the carrier of the phone?");
        String carrier = scanner.nextLine();

        Cellphone cellphone = new Cellphone(serialNumber, model, phoneNumber, owner, carrier);

        System.out.println(cellphone.getOwner());

    }
}