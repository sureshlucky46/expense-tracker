package com.vcube.teamexpensemanager.controller;

import com.vcube.teamexpensemanager.dto.UserRequest;
import com.vcube.teamexpensemanager.entity.User;
import com.vcube.teamexpensemanager.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	 UserService userService;

	@PostMapping("/createUser")
	public ResponseEntity<User> CreateUser(@Valid @RequestBody UserRequest user) {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(userService.createUser(user));
	}

	
	
	@GetMapping("/getUsersList")
		List<User>findUsers() {
		return userService.getAllUsers();
	}


	
	@GetMapping("/getUser/{id}")
	 	User findUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	
	
	 @DeleteMapping("/deleteUser/{id}")
		void deleteUser(@PathVariable Long id) {
	    userService.deleteUser(id);
	}
	
	
}