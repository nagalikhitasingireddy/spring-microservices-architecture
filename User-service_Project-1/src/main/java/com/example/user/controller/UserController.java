package com.example.user.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.User;
import com.example.user.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id)
				.orElseThrow(() -> new RuntimeException("user not found"));
	}
	

	
}
