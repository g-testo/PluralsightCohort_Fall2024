package com.ps;

import java.util.Scanner; // Step 1

class Main {
    static Scanner scanner = new Scanner(System.in);
    // access modifier, static modifier, return type, name of method, inputs(parameters)
    public static void main(String[] args) {
        String temp = "Warm"; // "Hot", "Cold", "Warm"

        String clothesToWear = "";// "Pants, shirt, sweater, gloves, Beanie, Ear Muffs

        switch(temp) {
            case "Cold":
//                System.out.println("BBBBRRRrrrrrrrrrrrrr");
                clothesToWear += "Golves, Ear Muffs and Beanie";
            case "Warm":
//                System.out.println("AAAAAHHHHHhhhhhhhhhhhh");
                clothesToWear += "Shirt and pants";
            case "Hot":
//                System.out.println("OOOUUUUUCCCChhhhhhiiiiiiieeeeeee");
                clothesToWear += "Baseball cap, top and shorts";
            default:
                System.out.println("oouuu");
        }
        System.out.println(clothesToWear);





//        String animal = "Lion";
//
//        if(animal.equals("Lion")){
//            System.out.println("ROOOOAAAAAAARRRRRRRR");
//        }
//
//        String name = "Ezra";
//        int age = 17;
//
//        double price;
//        if(age == 18){
//            price = 22.50;
//        } else {
//            price = 25.00;
//        }
//
//        double price = false ? 22.50 : 25.00;
//
//
//
//        System.out.println("Price of admission: " + price);

//        int num = 5;
//
//        if(num < 10) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }


//        int sum = add();
//        System.out.println(sum);
//        int num1 = 10;
//        int num2 = 20;
//
//        int sum = add(num1, num2);
//
//        System.out.println(sum);
//
//        int num3 = 1;
//        int num4 = 2;
//
//        int sum1 = add(num3, num4);
//        System.out.println(sum1);
//
//        int num5 = 90;
//        int num6 = 50;
//
//        int sum2 = add(num5, num6);
//        System.out.println(sum2);
//
//
//        int sum3 = add(1000, 500);
//        System.out.println(sum3);
    }

    public static int add(){
        System.out.print("Please give me the first number: ");
        int numOne = scanner.nextInt();

        System.out.print("Please give me the second number: ");
        int numTwo = scanner.nextInt();

        // Logging
        return numOne + numTwo;
    }


}

