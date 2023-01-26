package com.minal.app.controller;

import com.minal.app.model.Appointment;
import com.minal.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/patientAppointment")
    public List<Appointment> getPatientAppointments(@RequestParam String patientName) {
        List listAppointments = new ArrayList();
        Appointment appointment1 = new Appointment("1", "Merry", "DrJoey", "4thJuly");
        listAppointments.add(appointment1);
        return listAppointments;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        System.out.println(appointment);
        return appointment;
    }

    @GetMapping("/map/patient")
    public Map mapPatient()
    {
        Map mapPatient = new HashMap();
        Prescription P1 = new Prescription("2","1","fever","Merry","DrJoey");
        mapPatient.put(P1.getPatientName(),P1);
        return mapPatient;
    }
}
