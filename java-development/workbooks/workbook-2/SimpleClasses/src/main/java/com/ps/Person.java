package com.ps;

public class Person {
    // Properties (Data)
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private int ssn;

    // Methods (Behavior)

    // Getter
    public String getFirstName(){
        return this.firstName;
    }
    // Setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", ssn=" + ssn +
                '}';
    }
}
