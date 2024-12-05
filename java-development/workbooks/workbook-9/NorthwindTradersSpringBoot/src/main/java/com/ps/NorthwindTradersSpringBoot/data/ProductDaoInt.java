package com.ps.NorthwindTradersSpringBoot.data;

import com.ps.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public interface ProductDaoInt {
    void add(Product product);
    List<Product> getAll();
}
