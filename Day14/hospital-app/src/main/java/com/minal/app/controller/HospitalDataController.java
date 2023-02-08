package com.minal.app.controller;

import com.minal.app.model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/hospitaldata")
public class HospitalDataController
{
    @Autowired
    com.minal.app.repository.hospitalRepository hospitalRepository;

    @GetMapping(value="/read")
    public @ResponseBody
    Iterable<Hospital> getAll(){
        return hospitalRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Hospital hospital) {
        hospitalRepository.save(hospital);
        return "saved";
    }

    @DeleteMapping(value = "/delete")
    public @ResponseBody
    String store(@RequestParam("id") final int id) {
       hospitalRepository.deleteById(id);
        return "deleted";
    }
}
