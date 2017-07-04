package com.sware.testapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.sware.testapp.domain.Flower;
public interface FlowerRepo extends MongoRepository<Flower, String> {

}
