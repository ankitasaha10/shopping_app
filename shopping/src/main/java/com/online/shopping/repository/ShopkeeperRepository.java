package com.online.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.online.shopping.entity.Shopkeeper;

@Repository
public interface ShopkeeperRepository  extends MongoRepository<Shopkeeper, String>{

}
