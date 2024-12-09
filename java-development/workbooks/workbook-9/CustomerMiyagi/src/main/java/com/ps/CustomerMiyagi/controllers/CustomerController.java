package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.models.Customer;
import com.ps.CustomerMiyagi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAll();
    }


}
