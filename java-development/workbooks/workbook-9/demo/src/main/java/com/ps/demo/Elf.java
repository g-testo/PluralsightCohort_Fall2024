package com.ps.demo;
//{
//        "name":"Alf",
//        "location": "North Pole",
//        "specialization": "Toys"
//        }
public class Elf {
    private String name;
    private String location;
    private String specialization;

    public Elf() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
