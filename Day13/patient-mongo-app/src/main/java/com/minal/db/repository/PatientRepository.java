package com.minal.db.repository;

import com.minal.db.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

public Patient findByName(String name);

public Patient save(Patient patient);

}
