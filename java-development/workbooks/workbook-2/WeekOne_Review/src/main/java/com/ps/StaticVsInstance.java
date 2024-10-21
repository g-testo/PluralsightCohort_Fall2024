package com.ps;

public class StaticVsInstance {
    public static void main(String[] args) {
        // Invoking or calling (Instance)
        StaticVsInstance StaticVsInstance = new StaticVsInstance();
        StaticVsInstance.addInstance(1,2);

        // Invoking or calling (Static) Inside the same class
        addStatic(3,4);

        // Outside the class
        StaticVsInstance.addStatic(5,6);

    }

    public void addInstance(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void addStatic(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
