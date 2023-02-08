package com.mongo.app.controller;

import com.mongo.app.model.Hospital;
import com.mongo.app.repository.HospitalRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    HospitalRespository hospitalRespository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Hospital create(@RequestBody Hospital hospital) {
        hospital = hospitalRespository.save(hospital);
        return hospital;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Hospital> readHospital() {
        return hospitalRespository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Hospital readByNameHospital(@PathVariable("name") String name) {
        return hospitalRespository.findByName(name);
    }
}
