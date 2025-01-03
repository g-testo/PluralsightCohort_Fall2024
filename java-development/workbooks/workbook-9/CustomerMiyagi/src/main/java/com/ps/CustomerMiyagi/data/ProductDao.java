package com.ps.CustomerMiyagi.data;

import com.ps.CustomerMiyagi.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll(String sort);
    Product findOne(int productId);
    Product create(Product product);
    void update(int id, Product product);
    void delete(int productId);
}
