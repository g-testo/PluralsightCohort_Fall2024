package com.ps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static ArrayList<Integer> deck = new ArrayList<>();
    static int computerScore = 0;
    static int userScore = 0;
    static int draw = 0;

    public static void main(String[] args) {
        generateCards();
        shuffleCards();

        System.out.println("Hi! Let's play!");
        int mainCommand;
        do {
            System.out.println("1) Deal Cards");
            System.out.println("2) Score");
            System.out.println("0) Exit");
            System.out.print("Command: ");
            mainCommand = commandScanner.nextInt();

            switch (mainCommand) {
                case 1:
                    int computerCard = getCard();
                    int userCard = getCard();
                    System.out.printf("Computer draws a %d, User draws a %d\n", computerCard, userCard);

                    if (computerCard > userCard) {
                        computerScore++;
                    } else if (userCard > computerCard) {
                        userScore++;
                    } else {
                        draw++;
                    }
                    break;
                case 2:
                    System.out.printf("Computer: %d, User: %d, Draw: %d\n", computerScore, userScore, draw);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found, try again");
            }
        } while (mainCommand != 0);


        // High Low
        // You vs computer
        // Draw cards from a deck
        // Ace,2,3,4,5,6,7,8,9,Jack,Queen,King
        // Four suits
        // 52 cards in deck

        // Data to keep track of:
        // static deck / ArrayList of [1,2,3,4,5,6,7,8,9,10,12,13] * 4
        // static int ComputerScore
        // static int MyScore

        // Actions:
        // Get a card from the deck
        // Shuffle the cards
        // Generate the cards

        // static methods vs following OOP
    }

    public static void generateCards() {
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 5; j++) { // Run 4 times
                deck.add(i);
            }
        }
    }

    public static void shuffleCards() {
        Collections.shuffle(deck);
    }

    public static int getCard() {
        return deck.remove(0);
    }
}