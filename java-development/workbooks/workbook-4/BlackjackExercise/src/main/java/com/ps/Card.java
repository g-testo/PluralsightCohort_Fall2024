package com.ps;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        // only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        // only return the value if the card is face up
        if (isFaceUp) {
            // determine point value and return it
            // A = 11
            // K, Q, J = 10
            // all numeric cards are equal to their face value
            switch (value) {
                case "A":
                    return 11;
                case "K":
                case "Q":
                case "J":
                    return 10;
                default:
                    return Integer.parseInt(value);
            }
        } else {
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    public void displayCard() {
        String displaySuit;
        String displayColor;

        if (suit.equalsIgnoreCase("hearts")) {
            displaySuit = "♥";
            displayColor = RED;
        } else if (suit.equalsIgnoreCase("diamonds")) {
            displaySuit = "♦";
            displayColor = RED;
        } else if (suit.equalsIgnoreCase("spades")) {
            displaySuit = "♠";
            displayColor = BLACK;
        } else if (suit.equalsIgnoreCase("clubs")) {
            displaySuit = "♣";
            displayColor = BLACK;
        } else {
            displaySuit = "X";
            displayColor = BLACK;
        }

        System.out.println(displayColor + "┌─────────┐");
        System.out.printf("│%s        │\n", value);
        System.out.println("│         │");
        System.out.printf("│    %s    │\n", displaySuit);
        System.out.println("│         │");
        System.out.printf("│        %s│\n", value);
        System.out.println("└─────────┘" + RESET);
    }
}