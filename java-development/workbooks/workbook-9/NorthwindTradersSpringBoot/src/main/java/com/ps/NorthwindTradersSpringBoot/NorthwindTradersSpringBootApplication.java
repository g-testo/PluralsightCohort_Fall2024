package com.ps.NorthwindTradersSpringBoot;

import com.ps.NorthwindTradersSpringBoot.models.Product;
import com.ps.NorthwindTradersSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	static ProductService productService;
	@Autowired
	public NorthwindTradersSpringBootApplication(ProductService productService){
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);

		productService.add(new Product(4, "Ring", "Fashion", 19.99));
		List<Product> productList = productService.getAll();

		System.out.println(productList);

	}

}
