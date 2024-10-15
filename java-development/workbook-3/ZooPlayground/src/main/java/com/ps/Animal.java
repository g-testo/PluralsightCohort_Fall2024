package com.ps;

public class Animal {

    // properties
    private String name;
    private String type;
    private int age;
    private String origin;
    private boolean isPubliclyAvailable;

    private String dateOfArrival;
    private String timeOfArrival;

    // constructor


    public Animal(String name, String type, int age, String origin, boolean isPubliclyAvailable, String dateOfArrival, String timeOfArrival) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.origin = origin;
        this.isPubliclyAvailable = isPubliclyAvailable;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
    }

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

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                ", isPubliclyAvailable=" + isPubliclyAvailable +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", timeOfArrival='" + timeOfArrival + '\'' +
                '}';
    }
}