package com.sware.testapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sware.testapp.domain.Cart;
import com.sware.testapp.domain.Flower;
import com.sware.testapp.repository.CartRepository;

@RestController
@CrossOrigin
@RequestMapping("/cartRoute")
public class CartRestController {

	@Autowired
	CartRepository cartRepository;
	 @GetMapping("/cart")
		public List<Cart> getCartData() {
		 List<Cart> cartList=new ArrayList<Cart>();	
		 try{
				System.out.println("In get of getCartData");
				cartList=(List<Cart>) cartRepository.findAll();
			}catch (Exception e) {
				// TODO: handle exception
			}
			return  cartList;
		}
	 
	 
	 @SuppressWarnings("unchecked")
	@PostMapping("/cart")
	 public List<Cart> saveCart(@RequestBody List<Cart> cartList ){
		 System.out.println("In get of saveCart");
		 List<Cart>cartListReturned=new ArrayList<>();
		 try {
			 cartListReturned=(List<Cart>) cartRepository.save(cartList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		return cartListReturned;
		 
	 }
}
