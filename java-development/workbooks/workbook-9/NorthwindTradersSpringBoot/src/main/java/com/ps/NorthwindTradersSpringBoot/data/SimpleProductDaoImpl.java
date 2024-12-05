package com.ps.NorthwindTradersSpringBoot.data;

import com.ps.NorthwindTradersSpringBoot.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDaoImpl implements ProductDaoInt{
    private List<Product> products = new ArrayList<>();

    public SimpleProductDaoImpl() {
        Product product1 = new Product(1, "Headphones", "Electronics", 29.99);
        Product product2 = new Product(2, "Watch", "Fashion", 129.99);
        Product product3 = new Product(3, "Sunglasses", "Fashion", 59.99);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }
}
