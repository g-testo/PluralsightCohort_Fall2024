package com.ps;

import com.ps.data.VehicleDAOImpl;
import com.ps.models.Vehicle;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static Scanner inputScanner = new Scanner(System.in);
    private static BasicDataSource basicDataSource = new BasicDataSource();
    private static VehicleDAOImpl  vehicleDAOImpl = new VehicleDAOImpl(basicDataSource);


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
            System.out.println("1) Display vehicle by VIN");
            System.out.println("2) Display all vehicles");
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
        printAllVehicles();

        System.out.print("Please enter a vehicle VIN: ");
        String inputVin = inputScanner.nextLine();

        Vehicle foundVehicle = vehicleDAOImpl.getByVin(inputVin);

        System.out.println(foundVehicle);
    }

    private static void handleGetAllVehicles() {
        printAllVehicles();
    }

    private static void handleCreateVehicle() {
        System.out.println("Please provide vehicle details: ");

        System.out.print("Vin: ");
        String vin = inputScanner.nextLine();

        Vehicle vehicle = getVehicleDetails();
        vehicle.setVin(vin);

        vehicleDAOImpl.create(vehicle);
    }

    private static void handleUpdateVehicle() {
        System.out.println("Please enter the VIN of the vehicle you would like to update: ");
        String vin = inputScanner.nextLine();

        Vehicle vehicle = getVehicleDetails();

        vehicleDAOImpl.update(vin, vehicle);
    }

    private static void handleDeleteVehicle() {
        printAllVehicles();

        System.out.print("Please provide vehicle VIN to delete: ");
        String inputVin = inputScanner.nextLine();

        vehicleDAOImpl.delete(inputVin);
    }

    private static void printAllVehicles(){
        List<Vehicle> inventory = vehicleDAOImpl.getAll();
        for(Vehicle vehicle: inventory){
            System.out.printf("%s - %s %s \n", vehicle.getVin(), vehicle.getMake(), vehicle.getModel());
        }
    }

    private static Vehicle getVehicleDetails(){
        System.out.print("Make: ");
        String make = inputScanner.nextLine();

        System.out.print("Model: ");
        String model = inputScanner.nextLine();

        System.out.print("Color: ");
        String color = inputScanner.nextLine();

        System.out.print("Sold: ");
        boolean sold = inputScanner.nextBoolean();

        System.out.println("Dealership Id: ");
        int dealershipId = inputScanner.nextInt();

        return new Vehicle(null, make, model, color, sold, dealershipId);
    }

}
