package com.ps.data;

import com.ps.models.Vehicle;

import java.util.List;

public interface VehicleDAOInt {
    public Vehicle getByVin(String vin);
    public List<Vehicle> getAll();
    public void create(Vehicle vehicle);
    public void update(String vin, Vehicle vehicle);
    public void delete(String vin);
}
