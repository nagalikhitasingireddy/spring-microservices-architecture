package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import com.example.order.model.ProductDto;
import com.example.order.model.UserDto;
import com.example.order.feign.ProductInf;
import com.example.order.feign.UserInf;
import com.example.order.model.Orders;
import com.example.order.service.OrderService;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;
	
	@Autowired
	private ProductInf productInf;
	
	@Autowired
	private UserInf userInf;
	
	@GetMapping("/order/{id}")
	public String getOrderById(@PathVariable int id,HttpSession session) {
		Orders order=service.getUserById(id);
		int Pid=order.getPid();
		int Uid=order.getUid();
		ProductDto PDto=productInf.getProductById(Pid);
		UserDto UDto=userInf.getUserById(Uid);
		session.setAttribute("product",PDto);
		session.setAttribute("user",UDto);
		System.out.println("USER: " + UDto.getName());
		System.out.println("PRODUCT: " + PDto.getName());

		return "home";
	}
	
}
