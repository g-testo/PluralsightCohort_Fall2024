package com.ps.CustomerMiyagi.data.mysql;

import com.ps.CustomerMiyagi.data.ProductDao;
import com.ps.CustomerMiyagi.models.Customer;
import com.ps.CustomerMiyagi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MySqlProductDao implements ProductDao {
    private DataSource dataSource;

    @Autowired
    public MySqlProductDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> findAll(){
        String query = "SELECT * FROM product;";
        List<Product> products = new ArrayList<>();
        try (
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
//            while (resultSet.next()) {
//                Customer customer = mapCustomer(resultSet);
//                customers.add(customer);
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return customers;
    }
}
