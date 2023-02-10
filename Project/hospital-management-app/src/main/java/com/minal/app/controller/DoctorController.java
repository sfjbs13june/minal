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

    @RequestMapping(value = "/doctorappointment",method = RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam ("doctorName") String doctorName){

        return appointmentRepository.findByDoctorName(doctorName);
    }
    @RequestMapping(value = "/savedocappointment",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepository.save(appointment);
        return appointment;
    }
}
