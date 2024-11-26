package com.ps;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        basicDataSource.setUsername(args[0]);
        basicDataSource.setPassword(args[1]);

        SakilaDataManager dataManager = new SakilaDataManager(basicDataSource);

        List<Actor> names = dataManager.getAllActorNames();
        System.out.println(names);

        Actor actorResult = dataManager.getActorById(1);
        System.out.println(actorResult.getFirstName());


//        System.out.print("Give me a last name of an actor: ");
//        String lastNameToSearch = scanner.nextLine();
//
//        String query = "SELECT * FROM actor WHERE last_name LIKE ?;";
//        try(
//                Connection connection = basicDataSource.getConnection();
//                PreparedStatement statement = connection.prepareStatement(query);
//        ) {
//            statement.setString(1, "%" + lastNameToSearch + "%");
//            try(
//                    ResultSet results = statement.executeQuery();
//            ) {
//                System.out.printf("%-20s %s\n", "First Name", "Last Name");
//                System.out.println("------------------");
//                while (results.next()) {
//                    System.out.printf("%-20s %s\n",
//                            results.getString("first_name"),
//                            results.getString("last_name")
//                    );
//                }
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
