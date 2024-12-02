package com.ps.data;

import com.ps.models.Vehicle;

import java.util.List;

public interface VehicleDAOInt {
    public Vehicle getById(int id);
    public List<Vehicle> getAll();
    public void create(Vehicle vehicle);
    public void update(int id, Vehicle vehicle);
    public void delete(int id);
}
