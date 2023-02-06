package com.minal.app.controller;

import com.minal.app.model.Appointment;
import com.minal.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    AppointmentRepository appointRepository;

    @RequestMapping("/doctorappointment")
    public Appointment getAppointment(@RequestParam("doctorName") String doctorName)
    {

    }

    @RequestMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {

    }

}
