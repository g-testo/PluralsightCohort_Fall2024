package com.ps.CustomerMiyagi.data;

import com.ps.CustomerMiyagi.models.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    Customer findOne(int id);
    Customer create(Customer customer);
    void update(int id, Customer customer);
    void delete(int id);
}
