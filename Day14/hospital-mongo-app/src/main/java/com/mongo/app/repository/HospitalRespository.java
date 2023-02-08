package com.mongo.app.repository;

import com.mongo.app.model.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRespository extends MongoRepository<Hospital, String> {

public Hospital findByName(String name);

public Hospital save(Hospital hospital);

}
