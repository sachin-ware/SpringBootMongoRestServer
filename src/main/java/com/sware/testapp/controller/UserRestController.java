package com.sware.testapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sware.testapp.domain.User;
import com.sware.testapp.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/")
public class UserRestController {
	
	@Autowired 
	UserService userService;
	private User tempUser=null;
	
	@GetMapping("/")
	public String defaultResponse(){
		return "Hello, This is default response from SWARE.DEMORESTSERVER !!!!";
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		List<User> userList=null;
		try {
			userList=userService.getAllUsers();
		} catch (Exception e) {
			System.out.println("EXCEPTION getAllUsers in UserRestController:-----------------------------\n"+e.getMessage());
		}
		return userList;
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable String id){
		tempUser=null;
		try {
			tempUser=userService.getUserById(id);
		} catch (Exception e) {
			System.out.println("EXCEPTION getAllUsers in UserRestController:-----------------------------\n"+e.getMessage());
		}
		return tempUser;
	}
	
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user){
		tempUser=null;
		try {
			tempUser=userService.saveUserToDb(user);
			
		} catch (Exception e) {
			System.out.println("EXCEPTION saveUser in UserRestController:-----------------------------\n"+e.getMessage());
		}
		return tempUser;
	}
}
