package com.ps.CustomerMiyagi.data;

import com.ps.CustomerMiyagi.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
}
