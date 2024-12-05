package com.ps.NorthwindTradersSpringBoot.services;

import com.ps.NorthwindTradersSpringBoot.data.SimpleProductDaoImpl;
import com.ps.NorthwindTradersSpringBoot.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    SimpleProductDaoImpl simpleProductDaoImpl;

    @Autowired
    public ProductService(SimpleProductDaoImpl simpleProductDaoImpl){ // Magic! / DI / IOC
        this.simpleProductDaoImpl = simpleProductDaoImpl;
    }

    public void add(Product product){
        // Business Logic
        simpleProductDaoImpl.add(product);
    }

    public List<Product> getAll(){
        // Business Logic
        return simpleProductDaoImpl.getAll();
    }

}
