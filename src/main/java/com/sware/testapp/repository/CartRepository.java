package com.sware.testapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sware.testapp.domain.Cart;

@Transactional
@Repository
public interface CartRepository extends MongoRepository<Cart,String> {

}


