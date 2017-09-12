package com.sware.testapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sware.testapp.domain.Flower;
import com.sware.testapp.domain.User;
import com.sware.testapp.repository.FlowerRepo;
import com.sware.testapp.repository.FlowerRepository;

@RestController
@CrossOrigin
@RequestMapping("/flowerRest")
public class FlowerController {

	 @Autowired
	FlowerRepository flowerRepository;
	 
	 @GetMapping("/getFlower/{id}")
		public ResponseEntity<Flower> getFlower(@PathVariable String id) {
		 Flower flower=null;	
		 try{
				
				flower=flowerRepository.findOne(id);
			}catch (Exception e) {
				// TODO: handle exception
			}
			return  ResponseEntity.ok().body(flower);
		}
	 
	 @CrossOrigin
	 @PostMapping("/Login")
	 public String loginUser(@RequestBody User user ){
		 try {
			 System.out.println(user.getUserName()+"  "+user.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		return "logged in successfully";
		 
	 }
	 
	 
	 @GetMapping("/getme")
		public String getMe() {
		 System.out.println("Reached in controller");
			return  "Successfully reached server";
		}
	 
	 
	 @GetMapping("/flowers")
		public List<Flower> getAllFlowers() {
		 List<Flower> flowerList=new ArrayList<Flower>();	
		 try{
				System.out.println("In get of flowers");
			 flowerList=(List<Flower>) flowerRepository.findAll();
			}catch (Exception e) {
				// TODO: handle exception
			}
			return  flowerList;
		}
	 
	 
	 @SuppressWarnings("unchecked")
	@PostMapping("/flowers")
	 public List<Flower> saveFlowers(@RequestBody List<Flower> flowerList ){
		 List<Flower>flowerListReturned=new ArrayList<>();
		 try {
			 flowerListReturned=(List<Flower>) flowerRepository.save(flowerList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		return flowerListReturned;
		 
	 }
}

