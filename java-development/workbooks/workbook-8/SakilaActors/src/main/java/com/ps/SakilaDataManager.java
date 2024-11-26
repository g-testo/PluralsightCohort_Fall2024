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

    public List<Actor> getAllActorNames(){
        List<Actor> actorNames = new ArrayList<>();
        String query = "SELECT * FROM actor;";
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ){
            while(resultSet.next()){
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                Actor actor = new Actor();
                actor.setFirstName(firstName);
                actor.setLastName(lastName);

                actorNames.add(actor);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return actorNames;
    }

    public Actor getActorById(int id){
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

                    Actor actor = new Actor();
                    actor.setFirstName(firstName);
                    actor.setLastName(lastName);

                    return actor;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public void createActor(Actor actor){
        String query = "INSERT INTO actor(first_name, last_name) VALUES(?,?);";
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());

            int rows = preparedStatement.executeUpdate();

            System.out.printf("Rows updated %d\n", rows);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateActor(int id, Actor actor){
        String query = "UPDATE actor SET first_name = ?, last_name = ? WHERE actor_id = ?";

        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getFirstName());
            preparedStatement.setInt(3, id);

            int rows = preparedStatement.executeUpdate();
            System.out.printf("Rows updated %d\n", rows);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteActor(int id){
        String query = "DELETE FROM actor WHERE actor_id = ?;";
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setInt(1, id);
            int rows = preparedStatement.executeUpdate();
            System.out.printf("Rows updated %d\n", rows);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
