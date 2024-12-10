package com.ps.CustomerMiyagi.data;

import com.ps.CustomerMiyagi.models.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
    Customer findOne(int id);
}