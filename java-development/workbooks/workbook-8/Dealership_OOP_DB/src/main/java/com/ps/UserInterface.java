package com.ps;

import com.ps.data.VehicleDAOImpl;
import com.ps.models.Vehicle;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static BasicDataSource basicDataSource = new BasicDataSource();

    public static void init(){}

    public static void display(String username, String password){
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/dealership_db");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        init();

        int mainCommand;

        do{
            System.out.println("1) Manage Vehicles");
            System.out.println("0) Exit");
            System.out.print("Command: ");

            mainCommand = scanner.nextInt();

            switch(mainCommand){
                case 1:
                    handleManageVehicles();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }

        } while(mainCommand != 0);

    }

    public static void handleManageVehicles(){

        int manageVehicleCommand;

        do{
            System.out.println("Manage Vehicles");
            System.out.println("1) Get a vehicle by id");
            System.out.println("2) Get all vehicles");
            System.out.println("3) Create a vehicle");
            System.out.println("4) Update a vehicle");
            System.out.println("5) Delete a vehicle");
            System.out.println("0) Back");
            System.out.print("Command: ");

            manageVehicleCommand = scanner.nextInt();

            switch(manageVehicleCommand){
                case 1:
                    handleGetVehicle();
                    break;
                case 2:
                    handleGetAllVehicles();
                    break;
                case 3:
                    handleCreateVehicle();
                    break;
                case 4:
                    handleUpdateVehicle();
                    break;
                case 5:
                    handleDeleteVehicle();
                    break;
                case 0:
                    System.out.println("Going back...");
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }

        } while(manageVehicleCommand != 0);
    }

    private static void handleGetVehicle() {

        // Show index view of all vehicles
            // 1) 32ouhou3h2oh Honda Accord
        // Ask for a selection number
        // Get vehicle from database
        // Show vehicle details
    }

    private static void handleGetAllVehicles() {
        VehicleDAOImpl vehicleDAOImpl = new VehicleDAOImpl(basicDataSource);
        List<Vehicle> inventory = vehicleDAOImpl.getAll();

        for(Vehicle vehicle: inventory){
            System.out.println(vehicle);
        }
    }

    private static void handleCreateVehicle() {
        //  Ask the user for all details of the new vehicle
        //  Send to database to create
    }

    private static void handleUpdateVehicle() {
        // Ask the user for all change details
        // Ask the vin of the vehicle to update
        // Send to database to update
    }

    private static void handleDeleteVehicle() {
        // Ask the user for the vin to delete
        // Send to database to delete
    }

}
