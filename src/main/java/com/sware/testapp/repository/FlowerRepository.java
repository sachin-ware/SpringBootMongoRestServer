package com.sware.testapp.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sware.testapp.domain.Flower;
@Transactional
@Repository

public interface FlowerRepository  extends MongoRepository<Flower,String>//CrudRepository<Flower, String>//
{
//	public Flower findByFlowerName(String name);
//	public Flower findByFlowerId(String id);
//	public 	 Flower save(Flower flower);
	
	
}