package com.ps.data;

import com.ps.models.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAOInt{
    private DataSource dataSource;

    public VehicleDAOImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public Vehicle getById(int id) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = new ArrayList<>();

        String query = "SELECT * FROM vehicle";
        try(
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            while(resultSet.next()){
                String vin = resultSet.getString("vin");
                System.out.println(vin);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void create(Vehicle vehicle) {

    }

    @Override
    public void update(int id, Vehicle vehicle) {

    }

    @Override
    public void delete(int id) {

    }
}
