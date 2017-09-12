package com.sware.testapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sware.testapp.domain.Flower;
import com.sware.testapp.domain.User;

@Transactional
@Repository


public interface UserRepository extends MongoRepository<User,String> {

}
