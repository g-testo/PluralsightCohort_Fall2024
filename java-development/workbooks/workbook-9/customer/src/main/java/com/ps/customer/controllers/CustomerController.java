package com.ps.customer.controllers;

import com.ps.customer.models.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    public CustomerController() {
        customers.add(new Customer(1, "Greg", "123 5th Ave"));
        customers.add(new Customer(2, "Camron", "123 Unicorn Drive"));
        customers.add(new Customer(3, "Buddy", "123 North Pole Ave"));
    }

    // Get One
    // /api/customers/1
    // Customer
    @GetMapping("{id}")
    public Customer getOne(@PathVariable int id){
        for(Customer customer: customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    // Get All
    // /api/customers
    // List<Customer>
    @GetMapping
    public List<Customer> getAll(){
        return customers;
    }


    // Put
    // /api/customers/1
    // With body
    // void(Status)

    // Post
    // /api/customers
    // With body
    // Customer (with new id)
    @PostMapping
    public void create(@RequestBody Customer customer){
        customers.add(customer);
    }

    // Delete
    // /api/customers/1
    // void(Status)
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        for(Customer customer: customers){
            if(customer.getId() == id){
                customers.remove(customer);
            }
        }
    }
}
