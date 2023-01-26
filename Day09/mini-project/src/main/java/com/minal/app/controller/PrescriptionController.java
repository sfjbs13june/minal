package com.minal.app.controller;

import com.minal.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Prescription")
public class PrescriptionController {
    @GetMapping("/viewPrescription")
    public List<Prescription> getAllPrescription(@RequestParam String patientName){
        List listAppointments = new ArrayList();
        Prescription P1 = new Prescription("2","1","fever","Merry","DrJoey");
        listAppointments.add(P1);
        return listAppointments;
    }

    @PostMapping("/savePrescription")
    public Prescription savePrescription(@RequestParam Prescription prescription){
        System.out.println(prescription);
        return prescription;
    }

    @GetMapping("Map/prescription")
    public Map MapPrescription(){
        Map MapPrescription = new HashMap();
        Prescription P1 = new Prescription("2","1","fever","Merry","DrJoey");
        MapPrescription.put(P1.getPrescriptionId(),P1);
        return MapPrescription;
    }

}
