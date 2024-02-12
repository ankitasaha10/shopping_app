package com.online.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.online.shopping.entity.Manufacturer;

@Repository
public interface ManufacturerRepository  extends MongoRepository<Manufacturer, String>{

}
