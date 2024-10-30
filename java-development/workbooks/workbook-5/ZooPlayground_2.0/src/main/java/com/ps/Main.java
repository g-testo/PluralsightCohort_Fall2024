package com.ps;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Bronx", "111 Bronx", "555-555-5555");

        Lion animal1 = new Lion("Leo", 3, "Outdoors", "10-29-24", false, 6);
        Lion animal2 = new Lion("Gilbert", 12, "Outdoors", "10-23-24", true, 1);
        Axolotl animal3 = new Axolotl("Abby", 1, "10-28-24", true);

        animal1.setHasCleanHabitat(false);

        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        zoo1.addAnimal(animal3);

        zoo1.cleanAllHabitats();

        System.out.println(zoo1);

        // Main

        // Zoo - Has many

        // Animal
            // Lion
            // Bear
            // Tiger
            // Anteater
            // Axolotl

        // Method
        // cleanHabitat
    }
}