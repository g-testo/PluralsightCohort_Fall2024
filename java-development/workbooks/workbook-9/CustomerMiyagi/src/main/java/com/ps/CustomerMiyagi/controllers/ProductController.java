package com.ps.CustomerMiyagi.controllers;

import com.ps.CustomerMiyagi.data.ProductDao;
import com.ps.CustomerMiyagi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/products")
public class ProductController {

    private ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao){
        this.productDao = productDao;
    }

    // Get one
    @GetMapping("{id}")
    public Product getProductById(@PathVariable int id){
        return productDao.findOne(id);
    }

    // Get all
    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(required = false) String sort
    ){
        return productDao.findAll(sort);
    }

    // Create
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product){
        return productDao.create(product);
    }

    // Update
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        productDao.update(id, product);
    }
    // Delete
    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable int id){
        productDao.delete(id);
    }

}
