package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int mainMenuCommand;

        do {
            // Show all command options
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("0) Exit");

            // Ask the user for a command(Choose an option)
            System.out.print("Choose an option: ");
            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    div();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found! Please try again");
            }

        } while(mainMenuCommand != 0);

    }

    public static void add(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);
    }

    public static void sub(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 - num2);
    }

    public static void multi(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 * num2);
    }

    public static void div(){
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 / num2);
    }

}