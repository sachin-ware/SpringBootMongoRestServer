package com.sware.testapp.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cart")
public class Cart {
	
	@Id
	 String id;
	 String name;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String path;
	 String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
