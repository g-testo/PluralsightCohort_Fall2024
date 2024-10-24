package com.ps;

import java.util.Scanner;

public class Main {
    private static Scanner commandScanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Scanner

        // Ask player 1 for name
        System.out.print("Player One Name: ");
        String playerOneName = inputScanner.nextLine();

        // Ask player 2 for name
        System.out.print("Player Two Name: ");
        String playerTwoName = inputScanner.nextLine();

        // Keep track of user command
        int command;
        // do while

        Deck deck = new Deck();
        do{
            // Show the menu
            System.out.println("Please choose an options: ");
            System.out.println("1) Play");
            System.out.println("2) Exit");
            System.out.print("Command: ");
            command = commandScanner.nextInt();

            // switch
            switch(command){
                case 1:
                    // Get two cards for player one

                    Card cardOne = deck.deal();
                    Card cardTwo = deck.deal();
                    Hand playerOneHand = new Hand();
                    playerOneHand.deal(cardOne);
                    playerOneHand.deal(cardTwo);
//                    Player playerOne = new Player(playerOneName, playerOneHand);

                    Card cardThree = deck.deal();
                    Card cardFour = deck.deal();
                    Hand playerTwoHand = new Hand();
                    playerTwoHand.deal(cardThree);
                    playerTwoHand.deal(cardFour);
//                    Player playerTwo = new Player(playerTwoName, playerTwoHand);

                    // Get two cards for player two
                    System.out.println("Player One Cards: ");
                    playerOneHand.displayCards();

                    System.out.println("Player Two Cards: ");
                    playerTwoHand.displayCards();

                    int playerOneScore = playerOneHand.getValue();
                    int playerTwoScore = playerTwoHand.getValue();

                    // compare their scores
                    // Player 1 wins
                    if(playerOneScore > playerTwoScore){
                        System.out.println(playerOneName + " wins!");
                    // Player 2 wins
                    } else if(playerOneScore < playerTwoScore){
                        System.out.println(playerTwoName + " wins!");
                    // Draw
                    } else {
                        System.out.println("Draw!");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command is not found, try again");
            }

        } while(command != 2);

        // Play
            // Display player 1s hand
            // Display player 2s hand
            // Display who won
        // Exit
    }
}