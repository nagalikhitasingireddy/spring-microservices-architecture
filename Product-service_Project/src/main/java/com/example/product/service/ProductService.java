package com.example.product.service;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.product.model.Product;
import com.example.product.repo.ProductRepo;
@Service
public class ProductService {

	
	@Autowired
	ProductRepo repo;
	
	public Optional<Product> findProductById(int id){
		return repo.findById(id);
	}
}
