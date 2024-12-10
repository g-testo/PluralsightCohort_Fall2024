package com.ps.CustomerMiyagi.data.mysql;

import com.ps.CustomerMiyagi.data.CustomerDao;
import com.ps.CustomerMiyagi.models.Customer;
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
public class MySqlCustomerDao implements CustomerDao {

    private DataSource dataSource;

    @Autowired
    public MySqlCustomerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public List<Customer> findAll() {
        String query = "SELECT * FROM customer;";
        List<Customer> customers = new ArrayList<>();
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ){
            while(resultSet.next()){
                Customer customer = mapCustomer(resultSet);
                customers.add(customer);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer findOne(int id){
        String query = "SELECT * FROM customer WHERE customer_id = ?;";
        try(
            Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setInt(1, id);
            try(
                    ResultSet resultSet = preparedStatement.executeQuery();
            ){
                if(resultSet.next()){
                    return mapCustomer(resultSet);
                }
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    private Customer mapCustomer(ResultSet resultSet) throws SQLException {
        int customerId = resultSet.getInt("customer_id");
        String name = resultSet.getString("name");
        String phone = resultSet.getString("phone");
        return new Customer(customerId, name, phone);
    }
}
