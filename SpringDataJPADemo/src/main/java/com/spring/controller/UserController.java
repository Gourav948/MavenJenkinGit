package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.json.User;
import com.spring.service.UserService;

@RestController
@RequestMapping("/myapp")
public class UserController {
	
	@Autowired
	private UserService registrationService;

	@GetMapping("/user")
	public List<User> getAllUsers() {
		return registrationService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value="id") String userId) {
		return registrationService.getUserById(userId);
	}

	@PostMapping(value="/user", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User registerUser(@RequestBody User user) {
		return registrationService.save(user);
	}

	@PutMapping(value="/user/{id}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User updateUser(@RequestBody User user, @PathVariable(value="id") String id) {
		return registrationService.update(user, id);
	}
	
	@PutMapping(value="/user/login", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String loginUser(@RequestBody User user) {
		return registrationService.login(user);
	}
	@PutMapping(value="/user/logout", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String logoutUser(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.logout(authToken);
	}

	@DeleteMapping(value="/user/{id}")
	public boolean deleteUser(@PathVariable(value="id") String id) {
		return registrationService.delete(id);
	}

	
	
}
