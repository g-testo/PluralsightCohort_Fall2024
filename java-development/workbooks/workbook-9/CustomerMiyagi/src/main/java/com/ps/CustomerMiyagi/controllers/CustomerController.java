package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.data.CustomerDao;
import com.ps.CustomerMiyagi.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
    // request >> operation >> sql command
    // POST >> Create >> INSERT
    // GET  >> Read >> SELECT
    // PUT >> Update >> UPDATE
    // DELETE >> Delete >> DELETE

    private CustomerDao dao;

    @Autowired
    public CustomerController(CustomerDao dao){
        this.dao = dao;
    }

    @GetMapping("{id}")
    public Customer getOneCustomer(@PathVariable int id){
        return dao.findOne(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return dao.findAll();
    }

    @PostMapping
    public Customer postCustomer(@RequestBody Customer customer){
        return dao.create(customer);
    }

}
