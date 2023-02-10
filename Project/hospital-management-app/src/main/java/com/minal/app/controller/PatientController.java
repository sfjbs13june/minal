package com.minal.app.controller;

import com.minal.app.model.Appointment;
import com.minal.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam ("patientName") String patientName){

        return appointmentRepository.findByPatientName(patientName);
    }

    @PostMapping("/savepatientappointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;
    }
}
