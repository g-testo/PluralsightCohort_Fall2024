package com.ps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Animal> animals;

    public Zoo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.animals = new ArrayList<>();
    }

    public void cleanAllHabitats(){
        for(Animal animal: animals){
            animal.cleanHabitat();
        }
    }

    // Get all animals (sorted by name)
    public List<Animal> getAllAnimals(){
        Collections.sort(animals);
        return this.animals;
    }

    // Get all animals (sorted by age)

    // Get animal (Find by name)
    public Animal findAnimalByName(String name){
        String nameToSearch = name.toLowerCase();

        for(Animal animal: this.animals){
            String nameOfAnimal = animal.getName().toLowerCase();

            if(nameOfAnimal.contains(nameToSearch)){
                return animal;
            }
        }
        return null;
    }
    // get animals (filter by age range)
    public List<Animal> filterAnimalsByAgeRange(int minAge, int maxAge){
        // Accumulator Pattern
        // 1: Create an accumulator variable
        List<Animal> matchingAnimals = new ArrayList<>();

        // 2: Iterate through the array
        for(Animal animal: animals){
            int age = animal.getAge();
            if(age > minAge && age < maxAge){
                // 3: Accumulate
                matchingAnimals.add(animal);
            }
        }

        // 4: Return accumulator
        return matchingAnimals;
    }
    // get animals with a dirty habitat
    public List<Animal> getAnimalsWithDirtyHabitats(){
        List<Animal> matchingAnimals = new ArrayList<>();

        for(Animal animal: animals){
            if(!animal.hasCleanHabitat()){
                matchingAnimals.add(animal);
            }
        }

        return matchingAnimals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", animals=" + animals +
                '}';
    }
}
