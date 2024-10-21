package com.ps;

public class Codewars {
    public static void main(String[] args) {
        boolean result1 = feast("great blue heron", "garlic nann"); // true
        System.out.println(result1);
        boolean result2 = feast("chickadee", "chocolate cake"); // true
        System.out.println(result2);
    }

    public static boolean feast(String beast, String dish) {
        // get first letters of both strings
        char beastFirstLetter = beast.charAt(0);
        char dishFirstLetter = dish.charAt(0);
        // get last letters of both strings
        char beastLastLetter = beast.charAt(beast.length() - 1);
        char dishLastLetter = dish.charAt(dish.length() - 1);
        // if the first letter and last letter match
        return beastFirstLetter == dishFirstLetter && beastLastLetter == dishLastLetter;

//        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }


}
