package com.ps;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SakilaDataManager {
    private DataSource dataSource;

    public SakilaDataManager(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<String> getAllActorNames(){
        List<String> actorNames = new ArrayList<>();
        String query = "SELECT * FROM actor;";
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ){
            while(resultSet.next()){
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                actorNames.add(firstName + " " + lastName);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return actorNames;
    }

    public String getActorById(int id){
        String query = "SELECT * FROM actor WHERE actor_id = ?";

        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setInt(1, id);
            try(
                    ResultSet resultSet = preparedStatement.executeQuery();
            ){
                while(resultSet.next()){
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    return firstName + " " + lastName;
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
