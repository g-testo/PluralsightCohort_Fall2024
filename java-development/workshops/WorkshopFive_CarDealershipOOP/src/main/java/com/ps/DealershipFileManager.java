package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class DealershipFileManager {
    public static Dealership getDealership(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String firstLine = bufferedReader.readLine();
            String[] splitDealership = firstLine.split("\\|");
            String name = splitDealership[0];
            String address = splitDealership[1];
            String phone = splitDealership[2];
            Dealership dealership = new Dealership(name, address, phone);

            String input;

            while((input = bufferedReader.readLine()) != null) {
                String[] splitVehicle = input.split("\\|");
                int vin = Integer.parseInt(splitVehicle[0]);
                int year = Integer.parseInt(splitVehicle[1]);
                String make = splitVehicle[2];
                String model = splitVehicle[3];
                String vehicleType = splitVehicle[4];
                String color = splitVehicle[5];
                int odometer = Integer.parseInt(splitVehicle[6]);
                double price = Double.parseDouble(splitVehicle[7]);
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicle);
            }

            bufferedReader.close();

            return dealership;

        } catch(Exception exception){
            exception.printStackTrace();
        }

        return null;
    }
    public static void saveDealership(Dealership dealership){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.csv"));
            String firstLine = String.format("%s|%s|%s\n",
                    dealership.getName(),
                    dealership.getAddress(),
                    dealership.getPhone()
            );

            bufferedWriter.write(firstLine);

            List<Vehicle> vehicles = dealership.getAllVehicles();
            for(Vehicle vehicle: vehicles){
                String vehicleLine = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f\n",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice()
                );
                bufferedWriter.write(vehicleLine);
            }
            bufferedWriter.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
