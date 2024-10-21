package com.ps;

public class MyMain {
    static int counter = 0;

    public static void main(String[] args) {
//        System.out.println("Trigger");
        boolean bool;

        // Data types

        // Primitive (8)

        // boolean
        // 1 bit
        // true(1) or false(0)
        boolean booly = false;

        // byte (Signed)
        // 1 byte (8 bits)
        // -128 to 127
        byte bitey = 100;

        // char (Unsigned)
        // 2 bytes (16 bits)
        // 0 to 65,535
        char chary = 40_000;
        char chary2 = 'a';

        // short (Signed)
        // 2 bytes (16 bits)
        // -32,768 to 32,767
        short shorty = 30_000;

        // int
        // 4 bytes
        // -2,147,483,648 to 2,147,483,647
        int inty = 2_100_000_000;

        // long
        // 8 bytes
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long longy = 1_000_000_000_000_000L;

        // float
        // 4 bytes
        // +- 3.40282347E+38F
        float floaty = 3.14F;

        // double
        // 8 bytes
        // +- 1.79769313486231570+308
        double doubly = 3.144367826723672367;

        // Non-Primitive (Data Structures)

        // String
        String stringy = "Gregorio";
//        Order of operations

//        Parentheses

//        Exponents

//        Multi
//        Div

//        Add
//        Sub
//
//        int num = 0;
//
//        System.out.println(num--);
//        System.out.println(num);

//        short shortNum = 10;
//        long longNum;
//        longNum = shortNum;

//        long longNum = 10;
//        short shortNum;
//        shortNum = (short)longNum; // Casting

        String word1 = "Hello";
        String word2 = "World";

        System.out.println("My secret passphrase is: " + word1 + " " + word2 + " %s. And it is awesome!");

        String message = String.format("My secret passphrase is: %s %s. And it is awesome!", word1, word2);
        System.out.println(message);
        System.out.printf("My secret passphrase is: %s %s. And it is awesome!", word1, word2);


    }

    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }
}
