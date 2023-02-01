package com.minal.db.controller;

import com.minal.db.model.Patient;
import com.minal.db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRespository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        patient = patientRespository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Patient> readStudent() {
        return patientRespository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Patient readByNamePatient(@PathVariable("name") String name) {
        return patientRespository.findByName(name);
    }
}
