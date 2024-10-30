package com.ps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Kitkat kitkat = new Kitkat("sweet", 5.99f,"crispy", "dark");
        ReesesCup reesesCup = new ReesesCup();

        ArrayList<Candy> bagOfGregsCandy = new ArrayList<>();

        bagOfGregsCandy.add(kitkat);
        bagOfGregsCandy.add(reesesCup);

        for(Candy candy: bagOfGregsCandy){
            if(candy instanceof Kitkat) {
                Kitkat kitkat1 = (Kitkat)candy;
                System.out.println(kitkat1.getWaferType());
//                convert to kitkat class
            }
        }


        // 4 Pillars of OOP
        // Encapsulation
        // Inheritance
        // Polymorphism(Many forms)

    }
}