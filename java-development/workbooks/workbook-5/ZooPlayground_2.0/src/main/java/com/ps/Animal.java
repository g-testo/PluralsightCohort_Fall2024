package com.ps;

public abstract class Animal {
    private String name;
    private String species;
    private int age;
    private String habitatStructure;
    private boolean hasCleanHabitat;
    private String dateLastCleaned;

    public Animal(String name, String species, int age, String habitatStructure, boolean hasCleanHabitat, String dateLastCleaned) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitatStructure = habitatStructure;
        this.hasCleanHabitat = hasCleanHabitat;
        this.dateLastCleaned = dateLastCleaned;
    }

    abstract public void cleanHabitat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitatStructure() {
        return habitatStructure;
    }

    public void setHabitatStructure(String habitatStructure) {
        this.habitatStructure = habitatStructure;
    }

    public boolean hasCleanHabitat() {
        return hasCleanHabitat;
    }

    public void setHasCleanHabitat(boolean hasCleanHabitat) {
        this.hasCleanHabitat = hasCleanHabitat;
    }

    public String getDateLastCleaned() {
        return dateLastCleaned;
    }

    public void setDateLastCleaned(String dateLastCleaned) {
        this.dateLastCleaned = dateLastCleaned;
    }
}
