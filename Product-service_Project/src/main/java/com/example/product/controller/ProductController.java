package com.example.product.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@GetMapping("/get/{id}")
	public Product getProductById(@PathVariable int id){
		return service.findProductById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
	}
	
}
