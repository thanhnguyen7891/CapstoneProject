package com.cogent.infotech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.infotech.entity.User;
import com.cogent.infotech.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.update(user);
	}
	
	@PostMapping("/addnewuser")
	public User addNewUser(@RequestBody User user) {
		return userService.update(user);
	}

	
	@GetMapping("/getallusers")
	public List<User> getAllUser() {
	
		return userService.getAllUser();
	}
	
	@GetMapping("/getuserbyId/{id}")
	public User getUserById(@PathVariable int id) {
		User u = userService.getUserById(id);
		return u;
	}
	
	
	@PutMapping("/getbyname")
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}
	
	@PutMapping("/updateuser")
	public User getByName(@RequestBody User user) {
		return userService.update(user);
	}

	@GetMapping("/getbyalluserType")
	public String getByAllUserType() {
		return "Get by all user type";
	}
	
	@GetMapping("/loginVerify")
	public String userLoginVerify() {
		return "Log in verify";
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public User deleteById(@PathVariable int id) {
		return userService.deleteById(id);
	}
	
	@GetMapping("/getLogin") 
	public boolean GetLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) { 
		return userService.verify(username, password);
	}
}
