package com.sware.testapp.DemoRestServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.sware.testapp.repository")
@ComponentScan("com.sware.testapp")
//@ComponentScan("com.sware.testapp.repository")	
public class DemoRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestServerApplication.class, args);
	}
}
