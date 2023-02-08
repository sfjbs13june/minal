package com.minal.app.repository;

import com.minal.app.model.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface hospitalRepository extends CrudRepository<Hospital,Integer> {
}
