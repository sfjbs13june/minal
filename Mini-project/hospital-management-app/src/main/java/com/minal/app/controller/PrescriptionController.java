package com.minal.app.controller;

import com.minal.app.model.Prescription;
import com.minal.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;
    @RequestMapping("/viewprescription")
    public Prescription getAllPrescriptions(String patientName) {
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){

    }


}
