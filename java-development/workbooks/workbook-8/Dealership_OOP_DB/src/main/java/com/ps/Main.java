package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

public class Main {
    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];

        UserInterface.display(username, password);
        // Create schema for Vehicles and Dealerships, SQL
        // Create classes(OOP) for Vehicles and Dealerships

        // Create the CLI User Interface (Vehicle CRUD)

        // - Manage Vehicles
            // - Get a vehicle by ID
            // - Get all vehicles
            // - Create a vehicle
            // - Update a vehicle by ID
            // - Delete a vehicle by ID
        // Exit

        // Create a VehicleDAO(Data Access Object) class
        // - Vehicle getById(int id)
        // - List<Vehicles> getAll()
        // - void create(Vehicle vehicle)
        // - void update(int id, Vehicle vehicle)
        // - void delete(int id)
    }
}