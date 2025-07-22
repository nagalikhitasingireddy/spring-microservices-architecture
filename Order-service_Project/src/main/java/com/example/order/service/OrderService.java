package com.example.order.service;

import org.springframework.stereotype.Service
;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.order.model.Orders;
import com.example.order.repo.OrderRepository;
@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	public Orders getUserById(int id ) {
		return repo.findById(id)
				.orElseThrow(() -> new RuntimeException("order not found"));
	}
	
}
