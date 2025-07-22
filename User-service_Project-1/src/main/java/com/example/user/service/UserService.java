package com.example.user.service;

import org.springframework.stereotype.Service;
import com.example.user.repo.UserRepo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.user.model.User;
@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
	
	public Optional<User> getUserById(int id) {
		return repo.findById(id);
	}
	
	
	
}
