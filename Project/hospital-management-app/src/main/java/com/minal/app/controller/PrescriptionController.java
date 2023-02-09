package com.minal.app.controller;

import com.minal.app.model.Prescription;
import com.minal.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

    @GetMapping(value = "/viewprescription")
    public List<Prescription> getAllPrescriptions(String patientName) {

            return prescriptionRepository.findAll();
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;
    }
}
