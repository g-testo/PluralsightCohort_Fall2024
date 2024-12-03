package com.ps.data;

import com.ps.models.Vehicle;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAOImpl implements VehicleDAOInt {
    private DataSource dataSource;

    public VehicleDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Vehicle getByVin(String vin) {
        String query = "SELECT * FROM vehicle WHERE vin = ?;";
        try(
            Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, vin);
            try(
                ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    return mapVehicle(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = new ArrayList<>();
        String query = "SELECT * FROM vehicle;";
        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Vehicle vehicle = mapVehicle(resultSet);
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public void create(Vehicle vehicle) {
        String query = "INSERT INTO vehicle (`vin`, `make`, `model`, `color`, `sold`, `dealership_id`) VALUES(?,?,?,?,?,?)";
        try(
            Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, vehicle.getVin());
            preparedStatement.setString(2, vehicle.getMake());
            preparedStatement.setString(3, vehicle.getModel());
            preparedStatement.setString(4, vehicle.getColor());
            preparedStatement.setBoolean(5, vehicle.isSold());
            preparedStatement.setInt(6, vehicle.getDealership_id());
            int effectedRows = preparedStatement.executeUpdate();
            if(effectedRows < 1){
                System.out.println("Error: Vehicle not added");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(String vin, Vehicle vehicle) {
        String query = "UPDATE vehicle SET make=?, model=?, color=?, sold=?, dealership_id=? WHERE vin=?";

        try(
            Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, vehicle.getMake());
            preparedStatement.setString(2, vehicle.getModel());
            preparedStatement.setString(3, vehicle.getColor());
            preparedStatement.setBoolean(4, vehicle.isSold());
            preparedStatement.setInt(5, vehicle.getDealership_id());
            preparedStatement.setString(6, vin);

            int rowsEffected = preparedStatement.executeUpdate();

            if(rowsEffected < 1){
                System.out.println("Error: Vehicle not updated");
            }

        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String vin) {
        String query = "DELETE FROM vehicle WHERE vin = ?";
        try(
            Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, vin);
            int effectedRows = preparedStatement.executeUpdate();
            if(effectedRows < 1){
                System.out.println("Error: Vehicle not deleted");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    private Vehicle mapVehicle(ResultSet resultSet) throws SQLException {
        String vin = resultSet.getString("vin");
        String make = resultSet.getString("make");
        String model = resultSet.getString("model");
        String color = resultSet.getString("color");
        boolean sold = resultSet.getBoolean("sold");
        int dealershipId = resultSet.getInt("dealership_id");

        return new Vehicle(vin, make, model, color, sold, dealershipId);
    }
}
