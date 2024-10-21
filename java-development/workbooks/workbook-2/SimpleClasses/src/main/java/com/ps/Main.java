package com.ps;

public class Main {
    public static void main(String[] args){
        // OOP -- Design pattern for programming

        // DDD -- Domain Driven Design

        Person person1 = new Person();
        person1.setFirstName("Gregorio");
        person1.setLastName("Testo");
        person1.setLocation("NYC");

        Person person2 = new Person();
        person2.setFirstName("Ciara");

        System.out.println(person1.getFirstName());

        System.out.println(person1);
        System.out.println(person2);

    }

}
