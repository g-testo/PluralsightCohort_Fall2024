package com.ps;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String fName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String mName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = "";

        fullName += fName;

        if(!mName.equals("")){
            fullName += " " + mName;
        }

        fullName += " " + lName;

        if(!suffix.equals("")){
            fullName += ", " + suffix;
        }

        System.out.printf("Full name: %s", fullName);

    }
}
