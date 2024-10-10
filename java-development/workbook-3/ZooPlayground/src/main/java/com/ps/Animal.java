package com.ps;

public class Animal {

    // properties
    private String name;
    private String type;
    private int age;
    private String origin;
    private boolean isPubliclyAvailable;

    // constructor
    public Animal(String name, String type, int age, String origin, boolean isPubliclyAvailable) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.origin = origin;
        this.isPubliclyAvailable = isPubliclyAvailable;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isPubliclyAvailable() {
        return isPubliclyAvailable;
    }

    public void setPubliclyAvailable(boolean publiclyAvailable) {
        isPubliclyAvailable = publiclyAvailable;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Type: %s, Age: %d, Origin: %s, Publicly Available: %b", name, type, age, origin, isPubliclyAvailable);
    }
}
