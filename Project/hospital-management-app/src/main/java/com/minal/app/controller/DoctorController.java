package com.minal.app.controller;

import com.minal.app.model.Appointment;
import com.minal.app.model.Prescription;
import com.minal.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointmentRepository;

//    Prescription pre;

    @GetMapping("/doctorappointment")

    public List<Appointment> getAppointments(@RequestParam ("doctorName") String doctorName){

        return appointmentRepository.findByDoctorName(doctorName);
    }
    @PostMapping("/savedocappointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        appointment = appointmentRepository.save(appointment);
        return appointment;
    }
}
