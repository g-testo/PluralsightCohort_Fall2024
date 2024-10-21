package com.ps;

public class Main {
    public static void main(String[] args) {
        float[] prices = {9.99f, 74.99f, 99.99f, 3};

        float total = 0;
        // for i loop
//        for(int i=0;i<prices.length;i++){
//            total += prices[i];
//            System.out.printf("Index: %d, value: %.2f, running total: %.2f \n", i, prices[i], total);
//        }

        // for each
        for(float price: prices) {
            total += price;
        }

        System.out.println(total);
    }
}