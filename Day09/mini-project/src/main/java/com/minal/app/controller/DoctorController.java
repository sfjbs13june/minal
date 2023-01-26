package com.minal.app.controller;

import com.minal.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/get/appointments")
    public List<Appointment> getAppointments()
    {
        List listAppointments = new ArrayList();
        Appointment appointment1=new Appointment("1","Merry","DrJoey","4thJuly");
        listAppointments.add(appointment1);
        return listAppointments;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        System.out.println(appointment);
        return appointment;
    }

    @GetMapping("/map/doctor")
    public Map mapDoctor() {
        Map mapDoctor = new HashMap();
        Appointment Ap1 = new Appointment("1","Merry","DrJoey","4thJuly");
        mapDoctor.put(Ap1.getDoctorName(),Ap1);
        return mapDoctor;
    }
}
