package com.sware.testapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sware.testapp.domain.User;
import com.sware.testapp.repository.UserRepository;

@Service // This annotation is used to create a bean for this class , if we dont use this then we wont be able ot inject this service class in any other place.
public class UserService {
	@Autowired 
	UserRepository userRepository;
	public String sayHello(){
		return "hello";
	}
	
	public User saveUserToDb(User user){
		User savedUser=null;
		try {
			savedUser=userRepository.save(user);
		} catch (Exception e) {
			System.out.println("EXCEPTION :-----------------------------\n"+e.getMessage());
		}
		return savedUser;
	}
	
	public List<User> getAllUsers(){
		List<User> dbUsers=null; 
		try {
			dbUsers=userRepository.findAll();
		} catch (Exception e) {
			System.out.println("EXCEPTION :-----------------------------\n"+e.getMessage());
		};
		return dbUsers;
	}
	
	
	public User getUserById(String id){
		User usr=null;
		try {
			usr=userRepository.findOne(id);
		} catch (Exception e) {
			System.out.println("EXCEPTION :-----------------------------\n"+e.getMessage());
		}
		return usr;
	}
}
