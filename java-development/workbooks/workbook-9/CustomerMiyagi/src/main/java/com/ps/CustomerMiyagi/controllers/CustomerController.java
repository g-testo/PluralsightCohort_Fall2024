package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.data.CustomerDao;
import com.ps.CustomerMiyagi.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerDao dao;

    @Autowired
    public CustomerController(CustomerDao dao){
        this.dao = dao;
    }

    @GetMapping("/api/customers/{id}")
    public Customer getOneCustomer(@PathVariable int id){
        return dao.findOne(id);
    }

    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers(){
        return dao.findAll();
    }

}
