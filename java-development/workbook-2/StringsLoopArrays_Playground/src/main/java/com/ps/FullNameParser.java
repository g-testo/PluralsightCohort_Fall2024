package com.ps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name: ");
        String fullName = scanner.nextLine(); // "Dana L. Wyatt"

        String[] names = fullName.split(" ");  // ["Dana", "L.", "Wyatt"]
//        String[] names = fullName.split(Pattern.quote(" "));
        int numberOfName = names.length;

        System.out.println("First name: " + names[0]);

        if (numberOfName == 2) { // "Gregory Testo"
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + names[1]);
        } else { // "Gregory David Testo"
            System.out.println("Middle name: " + names[1]);
            System.out.println("Last name: " + names[2]);
        }
    }
}
