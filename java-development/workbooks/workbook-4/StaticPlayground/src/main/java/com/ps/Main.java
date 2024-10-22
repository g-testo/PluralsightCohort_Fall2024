package com.ps;

public class Main {
    public static void main(String[] args) {
        // Counter Example
        // variables
            // instance counter
            // static counter
        // methods
            // instance increment
            // static increment

        // staticCount: 7

        Counter counter1 = new Counter(); // instance: 4, static: 7
        Counter counter2 = new Counter(); // instance: 3, static: 7
        Counter counter3 = new Counter(); // instance: 0, static: 7

        counter1.instanceIncrement();
        counter2.instanceIncrement();
        counter1.instanceIncrement();
        counter2.instanceIncrement();
        counter1.instanceIncrement();
        counter2.instanceIncrement();
        counter1.instanceIncrement();

        counter1.staticIncrement();
        counter2.staticIncrement();
        counter1.staticIncrement();
        counter2.staticIncrement();
        counter1.staticIncrement();
        counter2.staticIncrement();
        counter3.staticIncrement();

        Counter.staticIncrement();
//        System.out.println(counter2.instanceCount);
        System.out.println(counter1.staticCount);
    }
}