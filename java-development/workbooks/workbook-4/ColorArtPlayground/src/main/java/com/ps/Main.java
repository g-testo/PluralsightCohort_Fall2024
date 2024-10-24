package com.ps;


public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
//        System.out.println("\u001B[32m" + "Hello world!" + "\u001B[0m");
        String heart = "♥";
        String spade = "♠";
        String diamond = "♦";
        String club = "♣";

        displayCard("A", spade, BLACK);
        displayCard("2", diamond, RED);
        displayCard("4", club, BLACK);
        displayCard("K", heart, RED);

    }

//    public static void displayCard(String cardValue, String suitSymbol) {
//        System.out.println("┌─────────┐");
//        System.out.printf("│%s        │\n", cardValue);
//        System.out.println("│         │");
//        System.out.printf("│    %s    │\n", suitSymbol);
//        System.out.println("│         │");
//        System.out.printf("│        %s│\n", cardValue);
//        System.out.println("└─────────┘");
//    }

    public static void displayCard(String cardValue, String suitSymbol, String color) {
        System.out.println(color + "┌─────────┐");
        System.out.printf("│%s        │\n", cardValue);
        System.out.println("│         │");
        System.out.printf("│    %s    │\n", suitSymbol);
        System.out.println("│         │");
        System.out.printf("│        %s│\n", cardValue);
        System.out.println("└─────────┘" + RESET);
    }
}