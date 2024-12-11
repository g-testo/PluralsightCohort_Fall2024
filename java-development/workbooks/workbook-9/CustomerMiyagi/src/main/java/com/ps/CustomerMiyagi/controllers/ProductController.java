package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.data.ProductDao;
import com.ps.CustomerMiyagi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao){
        this.productDao = productDao;
    }

    // Get one

    // Get all
    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(required = false) String sort
    ){
        return productDao.findAll(sort);
    }

    // Create

    // Update

    // Delete

}
