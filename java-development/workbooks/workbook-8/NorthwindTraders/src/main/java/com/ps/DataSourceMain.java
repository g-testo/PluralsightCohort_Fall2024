package com.ps;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataSourceMain {
    public static void main(String[] args) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        basicDataSource.setUsername(args[0]);
        basicDataSource.setPassword(args[1]);

        int productId = 1;

        String query = "SELECT * FROM products WHERE productid=?;";
        try(
                Connection connection = basicDataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setInt(1, productId);
            try(
                    ResultSet results = statement.executeQuery();
            ) {
                System.out.println("Id\tName\t\t\t\t\t\t\t\tPrice\tStock");
                System.out.println("------------------");
                while (results.next()) {
                    System.out.printf("%-4s %-35s %-8.2f %-7d%n",
                            results.getString("productid"),
                            results.getString("productname"),
                            results.getFloat("unitprice"),
                            results.getInt("unitsinstock"));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
