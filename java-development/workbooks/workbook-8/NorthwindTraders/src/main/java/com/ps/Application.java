package com.ps;

import java.sql.*;

public class Application {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    args[0],
                    args[1]
            );
            String query = "SELECT * FROM products;";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet results = statement.executeQuery();
//        while(results.next()){
//            System.out.println("Product Id : " + results.getString("productid"));
//            System.out.println("Name: " + results.getString("productname"));
//            System.out.println("Price: " + results.getFloat("unitprice"));
//            System.out.println("Stock: " + results.getInt("unitsinstock"));
//            System.out.println("\n------------------\n");
//        }
            System.out.println("Id\tName\t\t\t\t\t\t\t\tPrice\tStock");
            System.out.println("------------------");
            while (results.next()) {
                System.out.printf("%-4s %-35s %-8.2f %-7d%n",
                        results.getString("productid"),
                        results.getString("productname"),
                        results.getFloat("unitprice"),
                        results.getInt("unitsinstock"));
            }
            results.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException exception){
            exception.printStackTrace();
        }
    }
}
