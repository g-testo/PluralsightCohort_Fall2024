package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    // Get one

    // Get all
    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false) String order
    ){
        System.out.println("Get All Products was triggered " +  name + " " + sort + " " + order);
        return null;
    }

    // Create

    // Update

    // Delete

}
